package com.example.kiosk

class SelectMenu {
    fun select() {
        println("SHAKESHACK BURGER 에 오신걸 환영합니다.!!")
        println("\n------------------------------------\n")
        println(
            "아래 메뉴를 보시고 원하시는 메뉴의 번호를 입력해주세요\n\n" +
                    "[ SHAKESHACK MENU ]\n" +
                    "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                    "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                    "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                    "0. 종료             | 프로그램 종료"
        )

        while (true) {
            try{
                var selectNum = readLine()!!.toInt()
                when (selectNum) {
                    1 -> {
                        SelectBurger().select()
                        break
                    }
                    2 -> {
                        SelectForzen().select()
                        break
                    }
                    3 -> {
                       SelectDrink().select()
                        break
                    }
                    0 -> {
                        println("주문을 종료합니다.")
                        break
                    }
                    else -> {
                        println("다시 입력해주세요\n")
                        return main()
                    }
                }
            }   catch (e: NumberFormatException) {
                println("아무것도 입력하지 않으셨습니다. 번호를 보고 다시 입력해주세요\n")
                return main()
            }
        }
    }

}