package com.example.covidvaxxph

import java.util.*
import kotlin.collections.ArrayList

object Constants {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        if (engFilCounter.counter == "english") {
            val question1 = Question(
                1,
                "How many COVID-19 vaccine brands are available in the Philippines?",
                "7",
                "3",
                "4",
                "5",
                1
            )
            questionsList.add(question1)

            val question2 = Question(
                2,
                "All of the following COVID-19 vaccine brands have 2 doses except...",
                "Moderna",
                "Sinovac",
                "Janssen",
                "Pfizer",
                3
            )
            questionsList.add(question2)

            val question3 = Question(
                3,
                "Which of the following is NOT true?",
                "5G does not cause COVID-19.",
                "A vaccinated person has a 0% of getting COVID-19",
                "The first vaccine created was to prevent the spread of smallpox.",
                "Some vaccines can be taken orally.",
                2
            )
            questionsList.add(question3)

            val question4 = Question(
                4,
                "What does our body's immune system produce to fight virus and bacteria ?",
                "antibodies",
                "probodies",
                "antibiotics",
                "probiotics",
                1
            )
            questionsList.add(question4)

            val question5 = Question(
                5,
                "Fill in the blank: Vaccines contain a small amount of the ______ version of the virus.",
                "iOS 3.0",
                "happy",
                "dangerous",
                "harmless",
                4
            )
            questionsList.add(question5)

            val question6 = Question(
                6,
                "Which of the following vaccines brands has the highest average efficacy?",
                "Janssen",
                "Pfizer",
                "Bharat",
                "Sinovac",
                2
            )
            questionsList.add(question6)

            val question7 = Question(
                7,
                "How does the immune system defend the body from a virus that it has already encountered before? ",
                "Microchip in your body remembers how to fight the disease.",
                "Antibiotics remember how to fight the disease.",
                "Antibodies remember how to fight the disease.",
                "Probiotics remember how to fight the disease.",
                3
            )
            questionsList.add(question7)

            val question8 = Question(
                8,
                "Which of the following is true?",
                "Vaccination against COVID-19 is mandatory.",
                "Pfizer is a Viral Vector vaccine.",
                "Sinovac vaccine doses should be taken 12 weeks apart.",
                "A possible side-effect of COVID-19 vaccines is pain at the injection site.",
                4
            )
            questionsList.add(question8)

            val question9 = Question(
                9,
                "The following is a common side effect of Pfizer vaccines EXCEPT",
                "Allergic reaction",
                "Short-term mild-to-moderate pain at the injection site",
                "Fatigue",
                "Headache",
                1
            )
            questionsList.add(question9)

            val question10 = Question(10, "Do you want a free point?", "YES", "NO", "NO", "NO", 1)
            questionsList.add(question10)
        }
        else if (engFilCounter.counter == "filipino") {
            val question1 = Question(1, "Ilang tatak ng bakuna na laban sa COVID-19 ay maaaring makuha sa Pilipinas?", "7", "3", "4", "5", 1)
            questionsList.add(question1)

            val question2 = Question(2, "Ang mga sumusunod na tatak ng bakuna laban sa COVID-19 ay kailangan ng 2 goses maliban sa...", "Moderna", "Sinovac", "Janssen", "Pfizer", 3)
            questionsList.add(question2)

            // option 2 can be translated better, option 3 translated "smallpox" to "bulutong" idk what that is lol
            val question3 = Question(3, "Alin sa sumusunod ay HINDI totoo?", "Ang 5G ay hindi sanhi ng COVID-19",  "Ang taong nabakunahan ay may 0% na pagkakataon na makuha ang COVID-19", "Ang unang bakuna ay ginawa upang maiwasan ang pagkalat ng bulutong.", "May mga bakuna na maaaring inumin", 2)
            questionsList.add(question3)

            // question words [immune system, virus and bacteria] and all options are not translated
            val question4 = Question(4, "Ano ang ginagawa ng ng ating immune system para labanin ang virus at bacteria?", "antibodies", "probodies", "antibiotics", "probiotics", 1)
            questionsList.add(question4)

            // option 2 what does happy mean HELP, option 4 can be translated better
            val question5 = Question(5, "Punan ang blangko: Ang mga bakuna ay mayroong maliit na halaga ng ______ na bersyon ng virus.", "iOS 3.0", "masaya", "mapanganib", "hindi makakasama", 4)
            questionsList.add(question5)

            // question word [average] is not translated
            val question6 = Question(6, "Alin sa mga sumusunod na tatak ng bakuna ang may pinakamataas na average na bisa?", "Janssen", "Pfizer", "Bharat", "Sinovac", 2)
            questionsList.add(question6)

            // options 2-4 could be translated better
            val question7 = Question(7, "Paano ipinagtatanggol ng immune system ang katawan mula sa isang virus na natagpo na nito noon?", "Naaalala ng microchip ng iyong katawan kung paano labanan ang sakit.", "Naaalala ng mga antibiotic kung paano labanan ang sakit.", "Naaalala ng mga antibody kung paano labanan ang sakit.", "Naaalala ng mga probiotic kung paano labanan ang sakit.", 3)
            questionsList.add(question7)

            // option 1 not sure if sapilitan is ok, option 2 not sure if viral vector can be translated, option 4 can probably be translated better
            val question8 = Question(8, "Alin sa sumusunod ay totoo?", "Ang pagbabakuna laban sa COVID-19 ay sapilitan.", "Ang Pfizer ay isang Viral Vector na bakuna.", "12 na linggo ang pagitan ng goses ng bakunang Sinovac.", "Ang isang posibleng side-effect ng mga bakuna laban sa COVID-19 ay pananakit sa lugar ng iniksyon.", 4)
            questionsList.add(question8)

            // options 1-2 can be translated better (tnx google)
            val question9 = Question(9, "Ang mga sumusunod ay posibleng side-effect ng bakunang Pfizer MALIBAN SA...", "Allergic reaksyon", "Panandaliang banayad-hanggang-katamtamang pananakit sa lugar ng iniksyon", "Pagkapagod", "Sakit ng ulo", 1)
            questionsList.add(question9)

            val question10 = Question(10, "Gusto mo ba ng free point?", "OO", "HINDI", "HINDI", "HINDI", 1)
            questionsList.add(question10)
        }

        questionsList.shuffle()
        return questionsList
    }
}