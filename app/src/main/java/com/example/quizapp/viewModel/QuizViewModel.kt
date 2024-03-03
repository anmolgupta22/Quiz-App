package com.example.quizapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.database.RoomRepository
import com.example.quizapp.di.QuizRepository
import com.example.quizapp.model.QuizResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

class QuizViewModel @Inject constructor(
    private val repository: QuizRepository,
    private val roomRepository: RoomRepository,
) :
    ViewModel() {

    private val _quizQuestion = MutableLiveData<Result<QuizResponse?>>()
    val quizQuestion: LiveData<Result<QuizResponse?>> get() = _quizQuestion


    fun getQuizRequest(category: Int, difficulty: String) {
        val job = viewModelScope.async {
            repository.getQuiz(category, difficulty)
        }
        viewModelScope.launch(Dispatchers.IO) {
            _quizQuestion.postValue(job.await())
        }
    }

}
