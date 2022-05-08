package com.example.covidvaxxph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class quiz_result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_result)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        if (engFilCounter.counter == "english") {
            if (correctAnswers == 10) {
                findViewById<ImageView>(R.id.congrats).setImageResource(R.drawable.qresult_perfect)
                findViewById<TextView>(R.id.nice_work).text = "PERFECT! Amazing work!"
            }
            else if (correctAnswers in 8..9) {
                findViewById<ImageView>(R.id.congrats).setImageResource(R.drawable.qresult_great)
                findViewById<TextView>(R.id.nice_work).text = "You're almost there! Great work!"
            }
            else if (correctAnswers in 5..7) {
                findViewById<ImageView>(R.id.congrats).setImageResource(R.drawable.qresult_mid)
                findViewById<TextView>(R.id.nice_work).text = "Maybe you need a little more reviewing, but good job!"
            }
            else if (correctAnswers in 2..4) {
                findViewById<ImageView>(R.id.congrats).setImageResource(R.drawable.qresult_low)
                findViewById<TextView>(R.id.nice_work).text = "I know you can do better, aim for higher!"
            }
            else if (correctAnswers in 0..1) {
                findViewById<ImageView>(R.id.congrats).setImageResource(R.drawable.qresult_fail)
                findViewById<TextView>(R.id.nice_work).text = "Read and analyze more, then try again!"
            }

            findViewById<TextView>(R.id.quiz_score).text = "Your Score is $correctAnswers out of $totalQuestions"

            val quizFinishButton = findViewById<Button>(R.id.quiz_finish_button)
            quizFinishButton.setOnClickListener{
                val intent = Intent(this, interactive_page::class.java)
                startActivity(intent)
            }
        }
        else if (engFilCounter.counter == "filipino") {
            if (correctAnswers == 10) {
                findViewById<ImageView>(R.id.congrats).setImageResource(R.drawable.qresult_perfect)
                findViewById<TextView>(R.id.nice_work).text = "MAHUSAY! Ang galing mo!"
            }
            else if (correctAnswers in 8..9) {
                findViewById<ImageView>(R.id.congrats).setImageResource(R.drawable.qresult_great)
                findViewById<TextView>(R.id.nice_work).text = "Malapit na! Kaya mo 'yan!"
            }
            else if (correctAnswers in 5..7) {
                findViewById<ImageView>(R.id.congrats).setImageResource(R.drawable.qresult_mid)
                findViewById<TextView>(R.id.nice_work).text = "Siguro kailangan mo pang sumuri, pero magaling parin!"
            }
            else if (correctAnswers in 2..4) {
                findViewById<ImageView>(R.id.congrats).setImageResource(R.drawable.qresult_low)
                findViewById<TextView>(R.id.nice_work).text = "Alam ko mas mataas kaya mong makuha, galingan mo!"
            }
            else if (correctAnswers in 0..1) {
                findViewById<ImageView>(R.id.congrats).setImageResource(R.drawable.qresult_fail)
                findViewById<TextView>(R.id.nice_work).text = "Magbasa ka ulit, tapos subukin mo muli!"
            }

            findViewById<TextView>(R.id.quiz_score).text = "Ang iyong iskor ay $correctAnswers sa $totalQuestions"

            val quizFinishButton = findViewById<Button>(R.id.quiz_finish_button)
            quizFinishButton.text = "BUMALIK SA INTERAKTIB"
            quizFinishButton.setOnClickListener{
                val intent = Intent(this, inter_fil::class.java)
                startActivity(intent)
            }
        }
    }
}