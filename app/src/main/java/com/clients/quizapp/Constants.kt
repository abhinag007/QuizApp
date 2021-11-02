package com.clients.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Armania",
            "Australia",
            "Austria",
            1)

        val que2 = Question(2,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Australia",
            "Austria",
            2)

        val que3 = Question(3,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Armania",
            "Belgium",
            "Austria",
            3)

        val que4 = Question(4,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Australia",
            "Australia",
            "Brazil",
            4)

        val que5 = Question(5,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina",
            "Denmark",
            "Australia",
            "Austria",
            2)

        val que6 = Question(6,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Australia",
            "Australia",
            "Austria",
            1)

        val que7 = Question(7,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina",
            "germany",
            "Australia",
            "Austria",
            2)

        val que8 = Question(8,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina",
            "Australia",
            "India",
            "Austria",
            3)

        val que9 = Question(9,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "Armania",
            "Australia",
            "Austria",
            1)

        val que10 = Question(10,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina",
            "Australia",
            "Australia",
            "New Zealand",
            4)

//        for (i in 1..10)
//            questionsList.add("que$i" as Question)

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }

}