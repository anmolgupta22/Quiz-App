package com.example.quizapp.ui

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.MyApplication
import com.example.quizapp.adapter.QuizOptionAdapter
import com.example.quizapp.databinding.FragmentQuizBinding
import com.example.quizapp.model.QuizResponse
import com.example.quizapp.viewModel.QuizViewModel
import com.example.quizapp.viewModel.QuizViewModelFactory
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import kotlin.random.Random


class QuizFragment : Fragment(), QuizOptionAdapter.SelectedAnswerListener {

    private lateinit var binding: FragmentQuizBinding

    @Inject
    lateinit var viewModel: QuizViewModel

    @Inject
    lateinit var quizViewModelFactory: QuizViewModelFactory

    private var quizResponse: QuizResponse? = null
    private lateinit var quizOptionAdapter: QuizOptionAdapter
    private var selectedList: ArrayList<String> = arrayListOf()
    private var correctAnswerList: ArrayList<String?> = arrayListOf()
    private var selectedListFinal: HashMap<Int, String> = hashMapOf()
    private var categoryHm: HashMap<String, Int> = hashMapOf()
    private var questionNumber: Int? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        val typeListCategories =
            resources.getStringArray(com.example.quizapp.R.array.categories_type)
        for (i in typeListCategories.indices) {
            categoryHm[typeListCategories[i]] = i + 9
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentQuizBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val progressDialog = ProgressDialog(requireContext())
        progressDialog.setTitle("Loading")
        progressDialog.setMessage("Please wait...")
        progressDialog.setCancelable(false)
        progressDialog.show()
        (requireActivity().application as MyApplication).appComponent.inject(this)
        if (::viewModel.isInitialized) {
            viewModel =
                ViewModelProvider(this, quizViewModelFactory)[QuizViewModel::class.java]
        }


        val category = arguments?.getString("category")
        val difficulty = arguments?.getString("difficulty")
        Log.d("TAG", "onViewCreated: c$category  $difficulty")
        if (category != null && difficulty != null) {
            Log.d("TAG", "onViewCreated: check the catHm ${categoryHm[category]}")
            categoryHm[category]?.let { viewModel.getQuizRequest(it, difficulty) }
        }

        val linearLayoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        quizOptionAdapter = QuizOptionAdapter(requireContext(), this)
        linearLayoutManager.stackFromEnd = true
        val recyclerView = binding.optionRv
        recyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = quizOptionAdapter
            itemAnimator = null
            setHasFixedSize(true)
        }

        viewModel.quizQuestion.observe(this) { result ->
            if (result.isSuccess) {
                quizResponse = result.getOrNull()
                progressDialog.dismiss()

                Log.d("TAG", "onViewCreated: quiz response list $quizResponse")
                quizResponse?.results?.forEach {
                    correctAnswerList.add(it.correct_answer)
                }

                questionNumber = quizResponse?.results?.size
                binding.question.text = quizResponse?.results?.first()?.question
                Log.d("TAG",
                    "onViewCreated: check the number and list $questionNumber ${quizResponse?.results}  ")

                binding.questionNo.text = "1/${questionNumber}"
                quizResponse?.results?.first()?.incorrect_answers?.let {
                    addStringRandomly(it,
                        quizResponse?.results?.first()?.correct_answer)
                }?.let { quizOptionAdapter.setData(it) }
            }
        }
        binding.startBtn.setOnClickListener {
            val currentNo = extractNumerator(binding.questionNo.text.toString())
            if (currentNo != quizResponse?.results?.size) {
                if (selectedList.isNotEmpty()) {
                    selectedListFinal[currentNo] = selectedList.first()
                    binding.question.text = quizResponse?.results?.get(currentNo)?.question
                    quizResponse?.results?.get(currentNo)?.incorrect_answers?.let {
                        addStringRandomly(it,
                            quizResponse?.results?.get(currentNo)?.correct_answer)
                    }?.let { quizOptionAdapter.setData(it) }
                    binding.questionNo.text = "${currentNo + 1}/${questionNumber}"
                } else {
                    Toast.makeText(requireContext(),
                        "Please select any one option",
                        Toast.LENGTH_LONG).show()
                }
            } else {
                var rightAnswer = 0
                runBlocking {
                    correctAnswerList.forEach {
                        if (selectedList.contains(it)) {
                            rightAnswer++
                            //Log.d("TAG", "onViewCreated: check the right answer $rightAnswer")
                        }
                    }
                }
                Log.d("TAG", "onViewCreated: check the right answer $rightAnswer")


            }
        }

        binding.back.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(com.example.quizapp.R.id.nav_graph_host_fragment,
                    SelectCategoriesFragment())
                .addToBackStack(null) // Add to back stack if needed
                .commit()
        }


    }

    private fun extractNumerator(fraction: String): Int {
        val parts = fraction.split("/")
        return parts[0].toInt()
    }

    private fun addStringRandomly(
        list: ArrayList<String>,
        newString: String?,
    ): ArrayList<String> {
        val randomIndex = Random.nextInt(0, list.size.plus(1))
        if (newString != null) {
            list.add(randomIndex, newString)
        }
        return list
    }

    override fun selectedData(data: ArrayList<String>) {
        selectedList = data
    }


}