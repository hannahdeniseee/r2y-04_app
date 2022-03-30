package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView


class quiz_result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_result)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        findViewById<TextView>(R.id.quiz_score).text = "Your Score is $correctAnswers out of $totalQuestions"

        val quizFinishButton = findViewById<Button>(R.id.quiz_finish_button)
        quizFinishButton.setOnClickListener{
            val intent = Intent(this, interactive_page::class.java)
            startActivity(intent)
        }
    }
}