package com.example.kiosk

class SelectBurger {
    val burger1 = Burgers(1, "ShackBurger", 6900)
    val burger2 = Burgers(2, "SmokeShack", 8900)
    val burger3 = Burgers(3, "Shroom Burger", 9400)

    fun select() {
        println("원하는 버거를 선택해주세요")
        burger1.displayInfo()
        burger2.displayInfo()
        burger3.displayInfo()
        var burgerchoose = readLine()!!.toInt()
        when (burgerchoose) {
            1 -> burger1.burgerchoose()
            2 -> burger2.burgerchoose()
            3 -> burger3.burgerchoose()
        }
    }
}