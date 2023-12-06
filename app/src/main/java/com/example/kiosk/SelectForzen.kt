package com.example.kiosk

class SelectForzen {
    val ice1 = ForzenCustard(1,"Vanila", 2000)
    val ice2 = ForzenCustard(2,"Chocolate", 2500)
    val ice3 = ForzenCustard(3,"Strawberry", 2500)

    fun select() {
        println("원하는 아이스크림을 선택해주세요")
        ice1.displayInfo()
        ice2.displayInfo()
        ice3.displayInfo()
        var forzenchoose = readLine()!!.toInt()
        when(forzenchoose) {
            1 -> ice1.forzenchoose()
            2 -> ice2.forzenchoose()
            3 -> ice3.forzenchoose()
        }
    }
}