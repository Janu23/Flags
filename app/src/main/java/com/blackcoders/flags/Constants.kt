package com.blackcoders.flags

import kotlin.collections.ArrayList

lateinit var options: ArrayList<String>

object Constants {

    const val NAME: String = "name"
    const val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {

        var options = statesOption("Acre").shuffled()
        val que1 = Question(
            1, "De qual estado \né essa bandeira?",
            R.drawable.ac,
            options[0], options[1], options[2], options[3],
            options.indexOf("Acre") + 1
        )

        options = statesOption("Alagoas").shuffled()
        val que2 = Question(
            2, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.al,
            options[0], options[1], options[2], options[3],
            options.indexOf("Alagoas") + 1
        )

        options = statesOption("Amazonas").shuffled()
        val que3 = Question(
            3, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.am,
            options[0], options[1], options[2], options[3],
            options.indexOf("Amazonas") + 1
        )

        options = statesOption("Amapá").shuffled()
        val que4 = Question(
            4, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.ap,
            options[0], options[1], options[2], options[3],
            options.indexOf("Amapá") + 1
        )

        options = statesOption("Bahia").shuffled()
        val que5 = Question(
            5, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.ba,
            options[0], options[1], options[2], options[3],
            options.indexOf("Bahia") + 1
        )

        options = statesOption("Ceará").shuffled()
        val que6 = Question(
            6, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.ce,
            options[0], options[1], options[2], options[3],
            options.indexOf("Ceará") + 1
        )

        options = statesOption("Distrito Federal").shuffled()
        val que7 = Question(
            7, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.df,
            options[0], options[1], options[2], options[3],
            options.indexOf("Distrito Federal") + 1
        )

        options = statesOption("Espírito Santo").shuffled()
        val que8 = Question(
            8, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.es,
            options[0], options[1], options[2], options[3],
            options.indexOf("Brazil") + 1
        )

        options = statesOption("Goiás").shuffled()
        val que9 = Question(
            9, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.go,
            options[0], options[1], options[2], options[3],
            options.indexOf("Goiás") + 1
        )

        options = statesOption("Maranhão").shuffled()
        val que10 = Question(
            10, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.ma,
            options[0], options[1], options[2], options[3],
            options.indexOf("Maranhão") + 1
        )

        options = statesOption("Minas Gerais").shuffled()
        val que11 = Question(
            11, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.mg,
            options[0], options[1], options[2], options[3],
            options.indexOf("Minas Gerais") + 1
        )

        options = statesOption("Mato Grosso do Sul").shuffled()
        val que12 = Question(
            12, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.ms,
            options[0], options[1], options[2], options[3],
            options.indexOf("Mato Grosso do Sul") + 1
        )

        options = statesOption("Mato Grosso").shuffled()
        val que13 = Question(
            13, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.mt,
            options[0], options[1], options[2], options[3],
            options.indexOf("Mato Grosso") + 1
        )

        options = statesOption("Pará").shuffled()
        val que14 = Question(
            14, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.pa,
            options[0], options[1], options[2], options[3],
            options.indexOf("Pará") + 1
        )

        options = statesOption("Paraíba").shuffled()
        val que15 = Question(
            15, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.pb,
            options[0], options[1], options[2], options[3],
            options.indexOf("Paraíba") + 1
        )

        options = statesOption("Pernambuco").shuffled()
        val que16 = Question(
            16, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.pe,
            options[0], options[1], options[2], options[3],
            options.indexOf("Pernambuco") + 1
        )

        options = statesOption("Piauí").shuffled()
        val que17 = Question(
            17, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.pi,
            options[0], options[1], options[2], options[3],
            options.indexOf("Piauí") + 1
        )

        options = statesOption("Paraná").shuffled()
        val que18 = Question(
            18, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.pr,
            options[0], options[1], options[2], options[3],
            options.indexOf("Paraná") + 1
        )

        options = statesOption("Rio de Janeiro").shuffled()
        val que19 = Question(
            19, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.rj,
            options[0], options[1], options[2], options[3],
            options.indexOf("Rio de Janeiro") + 1
        )

        options = statesOption("Rio Grande do Norte").shuffled()
        val que20 = Question(
            20, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.rn,
            options[0], options[1], options[2], options[3],
            options.indexOf("Rio Grande do Norte") + 1
        )

        options = statesOption("Rondônia").shuffled()
        val que21 = Question(
            12, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.ro,
            options[0], options[1], options[2], options[3],
            options.indexOf("Rondônia") + 1
        )

        options = statesOption("Roraima").shuffled()
        val que22 = Question(
            22, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.rr,
            options[0], options[1], options[2], options[3],
            options.indexOf("Roraima") + 1
        )

        options = statesOption("Rio Grande do Sul").shuffled()
        val que23 = Question(
            23, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.rs,
            options[0], options[1], options[2], options[3],
            options.indexOf("Rio Grande do Sul") + 1
        )

        options = statesOption("Santa Catarina").shuffled()
        val que24 = Question(
            24, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.sc,
            options[0], options[1], options[2], options[3],
            options.indexOf("Santa Catarina") + 1
        )

        options = statesOption("Sergipe").shuffled()
        val que25 = Question(
            25, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.se,
            options[0], options[1], options[2], options[3],
            options.indexOf("Sergipe") + 1
        )

        options = statesOption("São Paulo").shuffled()
        val que26 = Question(
            26, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.sp,
            options[0], options[1], options[2], options[3],
            options.indexOf("São Paulo") + 1
        )

        options = statesOption("Tocantins").shuffled()
        val que27 = Question(
            27, "De qual estado \n" +
                    "é essa bandeira?",
            R.drawable.to,
            options[0], options[1], options[2], options[3],
            options.indexOf("Tocantins") + 1
        )

        val questionsList = ArrayList<Question>()

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
        questionsList.add(que11)
        questionsList.add(que12)
        questionsList.add(que13)
        questionsList.add(que14)
        questionsList.add(que15)
        questionsList.add(que16)
        questionsList.add(que17)
        questionsList.add(que18)
        questionsList.add(que19)
        questionsList.add(que20)
        questionsList.add(que21)
        questionsList.add(que22)
        questionsList.add(que23)
        questionsList.add(que24)
        questionsList.add(que25)
        questionsList.add(que26)
        questionsList.add(que27)



        questionsList.shuffle()

        return questionsList

    }

    private fun statesOption(answer: String): Set<String> {

        val options = mutableSetOf<String>()
        options.add(answer)
        val states = arrayListOf(
            "Acre",
            "Alagoas",
            "Amazonas",
            "Amapá",
            "Bahia",
            "Ceará",
            "Distrito Federal",
            "Espírito Santo",
            "Goiás",
            "Maranhão",
            "Minas Gerais",
            "Mato Grosso do Sul",
            "Mato Grosso",
            "Pará",
            "Paraíba",
            "Pernambuco",
            "Piauí",
            "Paraná",
            "Rio de Janeiro",
            "Rio Grande do Norte",
            "Rondônia",
            "Roraima",
            "Rio Grande do Sul",
            "Santa Catarina",
            "Sergipe",
            "São Paulo",
            "Tocantins"
        )

        do {

            options.add(states[(0..9).random()])

        } while (options.size < 4)

        return options

    }

}




