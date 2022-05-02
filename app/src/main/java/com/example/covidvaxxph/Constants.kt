package com.example.covidvaxxph

import java.util.*
import kotlin.collections.ArrayList

object Constants {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val question1 = Question(1, "How many COVID-19 vaccine brands are available in the Philippines?", "7", "3", "4", "5", 1)
        questionsList.add(question1)

        val question2 = Question(2, "All of the following COVID-19 vaccine brands have 2 doses except...", "Moderna", "Sinovac", "Janssen", "Pfizer", 3)
        questionsList.add(question2)

        val question3 = Question(3, "Which of the following is NOT true?", "5G does not cause COVID-19.",  "A vaccinated person has a 0% of getting COVID-19", "The first vaccine created was to prevent the spread of smallpox.", "Some vaccines can be taken orally.", 2)

        questionsList.add(question3)

        val question4 = Question(4, "What does our body's immune system produce to fight virus and bacteria ?", "antibodies", "probodies", "antibiotics", "probiotics", 1)
        questionsList.add(question4)

        val question5 = Question(5, "Fill in the blank: Vaccines contain a small amount of the ______ version of the virus.", "iOS 3.0", "happy", "dangerous", "harmless", 4)
        questionsList.add(question5)

        val question6 = Question(6, "Which of the following vaccines brands has the highest average efficacy?", "Janssen", "Pfizer", "Bharat", "Sinovac", 2)
        questionsList.add(question6)

        val question7 = Question(7, "How does the immune system defend the body from a virus that it has already encountered before? ", "Microchip in your body remembers how to fight the disease.", "Antibiotics remember how to fight the disease.", "Antibodies remember how to fight the disease.", "Probiotics remember how to fight the disease.", 3)
        questionsList.add(question7)

        val question8 = Question(8, "Which of the following is true?", "Vaccination against COVID-19 is mandatory.", "Pfizer is a Viral Vector vaccine.", "Sinovac vaccine doses should be taken 12 weeks apart.", "A possible side-effect of COVID-19 vaccines is pain at the injection site.", 4)
        questionsList.add(question8)

        val question9 = Question(9, "The following is a common side effect of Pfizer vaccines EXCEPT", "Allergic reaction", "Short-term mild-to-moderate pain at the injection site", "Fatigue", "Headache", 1)
        questionsList.add(question9)

        val question10 = Question(10, "Do you want a free point?", "YES", "NO", "NO", "NO", 1)
        questionsList.add(question10)

        questionsList.shuffle()
        return questionsList
    }
}