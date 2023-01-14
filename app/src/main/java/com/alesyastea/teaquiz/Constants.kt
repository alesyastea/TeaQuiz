package com.alesyastea.teaquiz

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val q1 = Question(
            1,
            "What is the tea plant called?",
            R.drawable.ic_1,
            "Camellia Sinensis",
            "Camellia Assamica",
            "Camellia Sinensis Sinensis",
            "Camellia Assamica Assamica",
            1 )
        questionsList.add(q1)

        val q2 = Question(
            2,
            "Where was matcha invented?",
            R.drawable.ic_2,
            "China",
            "Japan",
            "India",
            "Thailand",
            2)
        questionsList.add(q2)

        val q3 = Question(
            3,
            "What is the name of the tea ceremony?",
            R.drawable.ic_3,
            "Tea Pod",
            "Cha Dao",
            "Gong Fu Cha",
            "Pin Cha",
            2)
        questionsList.add(q3)

        val q4 = Question(
            4,
            "What matters most when steeping a cup or pot of tea?",
            R.drawable.ic_4,
            "Time",
            "Temperature",
            "Both A and B",
            "Neither A nor B",
            3)
        questionsList.add(q4)


        val q5 = Question(
            5,
            "What is the name of umami taste in tea?",
            R.drawable.ic_5,
            "Cliff Melody",
            "Wind noise in the pines",
            "Water breath",
            "Pure taste",
            1)
        questionsList.add(q5)

        val q6 = Question(
            6,
            "There are __ main types of tea",
            R.drawable.ic_6,
            "5",
            "8",
            "6",
            "7",
            3)
        questionsList.add(q6)

        val q7 = Question(
            7,
            "Which nation is the largest producer of tea",
            R.drawable.ic_7,
            "China",
            "India",
            "Japan",
            "Thailand",
            1)
        questionsList.add(q7)

        val q8 = Question(
            8,
            "The most expensive type of tea?",
            R.drawable.ic_8,
            "Shu Pu-erh",
            "Shen Pu-erр",
            "Yellow",
            "White",
            3)
        questionsList.add(q8)

        val q9 = Question(
            9,
            "The degree of fermentation of white tea?",
            R.drawable.ic_9,
            "5-7%",
            "2-4%",
            "8-10%",
            "11>%",
            1)
        questionsList.add(q9)

        val q10 = Question(
            10,
            "In terms of caffeine content from highest tpo lowest, which is correct?",
            R.drawable.ic_10,
            "Herbal, Black, Oolong, Green",
            "Oolong, Herbal, Black, Green",
            "Black, Oolong, Green, Herbal",
            "Green, Black, Oolong, Herbal",
            4)
        questionsList.add(q10)

        return questionsList
    }

}