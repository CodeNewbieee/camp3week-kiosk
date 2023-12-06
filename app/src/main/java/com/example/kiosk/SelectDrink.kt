package com.example.kiosk

class SelectDrink {
    val drink1 = Drinks(1, "Shack Made Lemonade", 3900)
    val drink2 = Drinks(2, "Fresh Brewed Iced Tea", 3400)
    val drink3 = Drinks(3, "Fifty/Fifty", 3500)

    fun select() {
        println("원하는 음료를 선택해주세요")
        drink1.displayInfo()
        drink2.displayInfo()
        drink3.displayInfo()
        var drinkchoose = readLine()!!.toInt()
        when (drinkchoose) {
            1 -> drink1.drinkchoose()
            2 -> drink2.drinkchoose()
            3 -> drink3.drinkchoose()
        }
    }
}
