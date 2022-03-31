package com.example.covidvaxxph

import java.util.*
import kotlin.collections.ArrayList

object Constants {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val question1 = Question(1, "What is our group code?", "R2Z-02", "R2Z-04", "R2Y-02", "R2Y-04", 4)
        questionsList.add(question1)

        val question2 = Question(2, "Who is our Research Adviser?", "Sir Aids", "Sir Roy", "Sir Javi", "Ma'am Aline ", 2)
        questionsList.add(question2)

        val question3 = Question(3, "Who in our group have never become classmates outside of Res 2?", "Hannah and MG", "Hannah and Mira", "MG and Mira", "None of the above", 1)
        questionsList.add(question3)

        val question4 = Question(4, "How many weeks do we have in our Lab Journal?", "16", "17", "18", "19", 3)
        questionsList.add(question4)

        val question5 = Question(5, "How many members of the group took Biology as a Core?", "0", "1", "2", "3", 4)
        questionsList.add(question5)

        val question6 = Question(6, "How many members of the group took Computer Science as an Elective?", "0", "1", "2", "3", 2)
        questionsList.add(question6)

        val question7 = Question(7, "What was Hannah's section in Grade 7?", "Ruby", "Opal", "Sapphire", "Topaz", 3)
        questionsList.add(question7)

        val question8 = Question(8, "What was MG's section in Grade 8?", "Adelfa", "Camia", "Champaca", "Dahlia", 4)
        questionsList.add(question8)

        val question9 = Question(9, "What was Mira's section in Grade 9?", "Beryllium", "Cesium", "Lithium", "Magnesium", 2)
        questionsList.add(question9)

        val question10 = Question(10, "Wahahahaha", "RIGHT", "WRONG", "WRONG", "WRONG", 1)
        questionsList.add(question10)

        questionsList.shuffle()
        return questionsList
    }
}