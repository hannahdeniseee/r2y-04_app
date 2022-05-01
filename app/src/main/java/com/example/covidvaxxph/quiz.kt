package com.example.covidvaxxph

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat

class quiz : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var emptyAnswer: Int = 0 // mira bookmark pls no remove


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        mQuestionsList = Constants.getQuestions()

        setQuestion()

        findViewById<TextView>(R.id.quiz_option1).setOnClickListener(this)
        findViewById<TextView>(R.id.quiz_option2).setOnClickListener(this)
        findViewById<TextView>(R.id.quiz_option3).setOnClickListener(this)
        findViewById<TextView>(R.id.quiz_option4).setOnClickListener(this)
        // submit
        findViewById<TextView>(R.id.quiz_submitbutton).setOnClickListener(this)

        //Toolbar toolbar = findViewById(R.id.toolbar)
        val mtoolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(mtoolbar)

    }

    private fun setQuestion() {

        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            findViewById<TextView>(R.id.quiz_submitbutton).text = "FINISH"
        }
        else {
            findViewById<TextView>(R.id.quiz_submitbutton).text = "SELECT AN ANSWER"
        }

        // var progressBar here
        var progressBar = findViewById<ProgressBar>(R.id.progress_bar) as ProgressBar
        progressBar.progress = mCurrentPosition
        // var progressText here
        var progressText = findViewById<TextView>(R.id.progress_text)
        progressText.text = "$mCurrentPosition" + "/" + progressBar.max
        // var questionText here
        var questionText = findViewById<TextView>(R.id.question_text)
        questionText.text = question!!.question

        // var option1Text here
        var option1Text = findViewById<TextView>(R.id.quiz_option1)
        option1Text.text = question.option1
        // var option2Text here
        var option2Text = findViewById<TextView>(R.id.quiz_option2)
        option2Text.text = question.option2
        // var option3Text here
        var option3Text = findViewById<TextView>(R.id.quiz_option3)
        option3Text.text = question.option3
        // var option4Text here
        var option4Text = findViewById<TextView>(R.id.quiz_option4)
        option4Text.text = question.option4
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, findViewById<TextView>(R.id.quiz_option1))
        options.add(1, findViewById<TextView>(R.id.quiz_option2))
        options.add(2, findViewById<TextView>(R.id.quiz_option3))
        options.add(3, findViewById<TextView>(R.id.quiz_option4))

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089")) // if not selected
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_bg)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId
        if (id == R.id.home_navbutton) {
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, home_Screen::class.java)
            startActivity(intent)
        }

        if (id == R.id.inter_navbutton) {
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, interactive_page::class.java)
            startActivity(intent)
        }
        if (id == R.id.ph_navbutton) {
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, vaxx_ph::class.java)
            startActivity(intent)
        }
        if (id == R.id.user_navbutton){
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, user_guide::class.java)
            startActivity(intent)
        }

        if (id == R.id.info_navbutton){
            Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, vaxx_info::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.quiz_option1 ->{
                selectedOptionView(findViewById<TextView>(R.id.quiz_option1), 1)
                setSubmitButton()
            }
            R.id.quiz_option2 ->{
                selectedOptionView(findViewById<TextView>(R.id.quiz_option2), 2)
                setSubmitButton()
            }
            R.id.quiz_option3 ->{
                selectedOptionView(findViewById<TextView>(R.id.quiz_option3), 3)
                setSubmitButton()
            }
            R.id.quiz_option4 ->{
                selectedOptionView(findViewById<TextView>(R.id.quiz_option4), 4)
                setSubmitButton()
            }
            R.id.quiz_submitbutton ->{
                if(emptyAnswer == 0)
                else {
                    findViewById<TextView>(R.id.quiz_submitbutton).text = "SELECT AN ANSWER"
                    findViewById<Button>(R.id.quiz_submitbutton).setBackgroundColor(getResources().getColor(R.color.light_purple))
                    if(mSelectedOptionPosition == 0){
                        mCurrentPosition++
                        emptyAnswer = 0
                        when{
                            mCurrentPosition <= mQuestionsList!!.size ->{
                                setQuestion()
                            }
                            else ->{
                                val intent = Intent(this, quiz_result::class.java)
                                intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                                intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                                startActivity(intent)
                            }
                        }
                    }
                    else {
                        val question = mQuestionsList?.get(mCurrentPosition-1)
                        findViewById<Button>(R.id.quiz_submitbutton).setBackgroundColor(getResources().getColor(R.color.submit_color))
                        if (question!!.answer != mSelectedOptionPosition){
                            answerView(mSelectedOptionPosition, R.drawable.incorrect_option_bg)
                        }
                        else {
                            mCorrectAnswers++
                        }
                        answerView(question.answer, R.drawable.correct_option_bg)

                        if (mCurrentPosition == mQuestionsList!!.size){
                            findViewById<TextView>(R.id.quiz_submitbutton).text = "FINISH"
                        }
                        else {
                            findViewById<TextView>(R.id.quiz_submitbutton).text = "GO TO NEXT QUESTION"
                        }
                        mSelectedOptionPosition = 0
                    }
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                findViewById<TextView>(R.id.quiz_option1).background = ContextCompat.getDrawable(this, drawableView)
            }
            2 ->{
                findViewById<TextView>(R.id.quiz_option2).background = ContextCompat.getDrawable(this, drawableView)
            }
            3 ->{
                findViewById<TextView>(R.id.quiz_option3).background = ContextCompat.getDrawable(this, drawableView)
            }
            4 ->{
                findViewById<TextView>(R.id.quiz_option4).background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun setSubmitButton() {
        findViewById<TextView>(R.id.quiz_submitbutton).text = "SUBMIT"
        findViewById<Button>(R.id.quiz_submitbutton).setBackgroundColor(getResources().getColor(R.color.submit_color))
    }

    // selected option highlight
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        emptyAnswer = 1

        tv.setTextColor(Color.parseColor("#363A43")) // if selected
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_bg)
    }
}