package com.example.quizapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.MyApplication
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentStudentDetailsBinding
import com.example.quizapp.viewModel.QuizViewModel
import com.example.quizapp.viewModel.QuizViewModelFactory
import javax.inject.Inject


class StudentDetailsFragment : Fragment() {

    private lateinit var binding: FragmentStudentDetailsBinding

    @Inject
    lateinit var viewModel: QuizViewModel

    @Inject
    lateinit var quizViewModelFactory: QuizViewModelFactory


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentStudentDetailsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (requireActivity().application as MyApplication).appComponent.inject(this)
        if (::viewModel.isInitialized) {
            viewModel =
                ViewModelProvider(this, quizViewModelFactory)[QuizViewModel::class.java]
        }


        binding.startBtn.setOnClickListener {
            if (validateName() && validateRegistrationNumber() && isValidGrade()) {

                val bundle = Bundle()
                bundle.putString("name", binding.name.text.toString().trim())
                val selectCategoriesFragment = SelectCategoriesFragment()
                selectCategoriesFragment.arguments = bundle
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_graph_host_fragment, selectCategoriesFragment)
                    .addToBackStack(null) // Add to back stack if needed
                    .commit()

            }
        }

    }

    private fun validateName(): Boolean {
        val name: String = binding.name.text.toString().trim()
        if (name.isEmpty()) {
            binding.name.error = "Name cannot be empty"
            return false
        } else if (name.length < 3) {
            binding.name.error = "Name must be at least 3 characters long"
            return false
        }
        return true
    }

    private fun validateRegistrationNumber(): Boolean {
        val registrationNumber: String = binding.register.text.toString().trim()
        if (registrationNumber.isEmpty()) {
            binding.register.error = "Registration number cannot be empty"
            return false
        } else if (registrationNumber.length != 4) {
            binding.register.error = "Registration number must be 4 characters long"
            return false
        }
        return true
    }


    private fun isValidGrade(): Boolean {
        // grade should be a number between 0 and 100
        val grade: String = binding.grade.text.toString().trim()
        return try {
            val gradeValue = grade.toInt()
            gradeValue in 0..100
            return true
        } catch (e: NumberFormatException) {
            binding.grade.error = "Invalid grade"
            false // Not a valid integer
        }
    }

}