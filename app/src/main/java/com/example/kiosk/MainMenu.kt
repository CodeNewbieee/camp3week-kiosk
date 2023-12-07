package com.example.kiosk

open class MainMenu() {
    open fun displayInfo() {
        println("SHAKESHACK BURGER 에 오신걸 환영합니다")
        println("-----------------------------------")
        println(
            """아래 메뉴를 보시고 원하시는 메뉴의 번호를 입력해주세요
[ SHAKESHACK MENU ]
1. Burgers         | 앵거스 비프 통살을 다져만든 버거
2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림
3. Drinks          | 매장에서 직접 만드는 음료
0. 종료             | 프로그램 종료""")
    }
}