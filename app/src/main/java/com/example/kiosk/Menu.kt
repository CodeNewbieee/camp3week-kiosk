package com.example.kiosk

class Menu() {
        fun displayInfo() {
                println(
                        "아래 메뉴를 보시고 원하시는 메뉴의 번호를 입력해주세요\n\n" +
                                "[ SHAKESHACK MENU ]\n" +
                                "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                                "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                                "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                                "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                                "0. 종료             | 프로그램 종료"
                )
                var selectNum: Int? = readLine()!!.toInt()
                val burger = Burgers()
                val forzenCustard = ForzenCustard()
                val drink = Drinks()
                val beer = Beer()

                while (true) {
                        try { when (selectNum) {
                                1 -> {burger.displayInfo()
                                        break}
                                2 -> {forzenCustard.displayInfo()
                                        break}
                                3 -> {drink.displayInfo()
                                        break}
                                4 -> {beer.displayInfo()
                                        break}
                                0 -> {println("주문을 종료합니다.")
                                        break}
                                else -> {println("다시 입력해주세요")
                                        return Menu().displayInfo()}
                                }
                        }
                        catch (e: NumberFormatException) {
                                println("잘못입력하였습니다. 다시 입력해주세요")
                                return Menu().displayInfo()
                        }
                }
        }
}
