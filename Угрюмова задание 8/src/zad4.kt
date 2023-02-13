fun main(){
    val Cake1 = Cake()
    while (true) {
        try {
            println("название пироженого\n1. Забайкальский край\n2. Райское наслаждение\n3. Ледниковый период")
            val name1: Int = readLine()!!.toInt()
            when (name1) {
                1 -> {
                    Cake1.name = "Забайкальский край"
                    Cake1.kkal = 160
                }
                2 -> {
                    Cake1.name = "Райское наслаждение"
                    Cake1.sale = 180
                    Cake1.kkal = 210
                }
                3 -> {
                    Cake1.name = "Ледниковый период"
                    Cake1.sale = 193
                    Cake1.kkal = 155
                }
            }
            println("из какого теста?\n1. из песочноого\n2. из слоёного \n3. из бисквитного")
            val testo1: Int = readLine()!!.toInt()
            when (testo1) {
                1 -> {
                    Cake1.testo = "песочного"
                    Cake1.kkal += 70
                }
                2 -> {
                    Cake1.testo = "слоёного"
                    Cake1.kkal += 45
                }
                3 -> {
                    Cake1.testo = "бисквитного"
                    Cake1.kkal += 35
                }
                else -> println("ошибка")
            }
            println("с каким кремом?\n1. с заварным\n2. с ягодным\n3. с ананасовым")
            val cream1: Int = readLine()!!.toInt()
            when (cream1) {
                1 -> {
                    Cake1.cream = "заварным"
                    Cake1.kkal += 30
                }
                2 -> {
                    Cake1.cream = "ягодным"
                    Cake1.kkal += 25
                }
                3 -> {
                    Cake1.cream = "ананасовым"
                    Cake1.kkal += 20
                }
                else -> println("ошибка")
            }
            Cake1.CakeSale()
            break
        } catch (e: Exception) {
            println("ошибка")
        }
    }
}