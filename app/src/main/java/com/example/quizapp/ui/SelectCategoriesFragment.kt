package com.example.quizapp.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.MyApplication
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentSelectCategoriesBinding
import com.example.quizapp.viewModel.QuizViewModel
import com.example.quizapp.viewModel.QuizViewModelFactory
import javax.inject.Inject


class SelectCategoriesFragment : Fragment() {


    private lateinit var binding: FragmentSelectCategoriesBinding

    @Inject
    lateinit var viewModel: QuizViewModel

    @Inject
    lateinit var quizViewModelFactory: QuizViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSelectCategoriesBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity().application as MyApplication).appComponent.inject(this)
        if (::viewModel.isInitialized) {
            viewModel =
                ViewModelProvider(this, quizViewModelFactory)[QuizViewModel::class.java]
        }

        val name = arguments?.getString("name")
        if (name != null) {
            binding.name.text = "Hey \uD83D\uDC4B $name"
        } else {
            binding.name.visibility = View.GONE
        }


        val typeListCategories = resources.getStringArray(R.array.categories_type)
        val adapterCategories = ArrayAdapter(context!!, R.layout.drop_down_item, typeListCategories)
        binding.autoSelectType.setAdapter(adapterCategories)


        val typeList = resources.getStringArray(R.array.difficulty_type)
        val adapter = ArrayAdapter(context!!, R.layout.drop_down_item, typeList)
        binding.diffAutoSelectType.setAdapter(adapter)

        binding.startBtn.setOnClickListener {
            if (validateForm()) {

                val bundle = Bundle()
                Log.d("TAG",
                    "onViewCreated:  check the cat data ${
                        binding.selectType.editText?.text.toString().trim()
                    }, ${binding.diffSelectType.editText?.text.toString().trim()}")
                bundle.putString("category", binding.selectType.editText?.text.toString().trim())
                bundle.putString("difficulty",
                    binding.diffSelectType.editText?.text.toString().trim())
                bundle.putString("name", name)
                val quizFragment = QuizFragment()
                quizFragment.arguments = bundle
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_graph_host_fragment, quizFragment)
                    .addToBackStack(null) // Add to back stack if needed
                    .commit()
            }
        }

    }

    private fun validateForm(): Boolean {
        val categoryText = binding.autoSelectType.text.toString()
        val difficultyText = binding.diffAutoSelectType.text.toString()

        // Perform validation logic
        if (categoryText.isEmpty()) {
            binding.autoSelectType.error = "Please select a category"
            return false
        }

        if (difficultyText.isEmpty()) {
            binding.diffAutoSelectType.error = "Please select a difficulty"
            return false
        }

        // If everything is valid, return true
        return true
    }

}