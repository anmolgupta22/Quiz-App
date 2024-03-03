package com.example.quizapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class QuizResponse(
    var responseCode: Int? = null,
    var results: ArrayList<Results> = arrayListOf()
)

data class Results(
    var type: String? = null,
    var difficulty: String? = null,
    var category: String? = null,
    var question: String? = null,
    var correct_answer: String? = null,
    var incorrect_answers: ArrayList<String> = arrayListOf()
)


@Entity(tableName = "tbl_quiz")
data class Score(
    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo
    var name: String? = null,

    @ColumnInfo
    var score: String? = null
)