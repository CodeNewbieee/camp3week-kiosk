package com.example.kiosk

import com.example.kiosk.menu.MenuItemCollection
import com.example.kiosk.menu.MyMenu
import com.example.kiosk.screen.FirstScreen
import com.example.kiosk.screen.MainScreen
import com.example.kiosk.screen.OrderCompleteScreen
import com.example.kiosk.screen.OrderScreen
import com.example.kiosk.screen.SelectMenuScreen
import com.example.kiosk.screen.ShoppingCartScreen
import com.example.kiosk.screen.TakeOutScreen

class MyKiosk private constructor(){

    //각 화면 구현
    private val firstScreen = FirstScreen()
    private val takeOutScreen = TakeOutScreen()
    private val mainScreen = MainScreen()
    private val selectMenuScreen = SelectMenuScreen()
    private val shoppingCartScreen = ShoppingCartScreen()
    private val orderScreen = OrderScreen()
    private val orderCompleteScreen = OrderCompleteScreen()

    companion object{
        //싱글톤 패턴
        private var instance:MyKiosk? = null

        fun newInstance():MyKiosk{
            if(instance == null) instance = MyKiosk()
            return instance!!
        }

        //모든 메뉴 정보
        val myMenu = MyMenu()
        val shoppingCart = MenuItemCollection()
        var isTakeOut:Boolean = false
    }

    //키오스크 프로그램 실행 (무한 반복)
    fun run(){
        //0. 첫 화면
        firstLoop@ while(true){
            firstScreen.run()

            //1. 먹고 가기/포장하기 화면
            takeOutLoop@ while(true) {
                val takeOutResult = takeOutScreen.run()
                when(takeOutResult) {
                    "1" -> isTakeOut = false
                    "2" -> isTakeOut = true
                    "q" -> continue@firstLoop //0. 첫 화면
                }

                //2. 메인 화면
                mainLoop@ while (true) {
                    val mainResult = mainScreen.run()
                    when (mainResult) {
                        "c" -> shoppingCartScreen.run() //4. 장바구니 화면
                        "o" -> {
                            //5. 주문하기 화면
                            val isOrderComplete = orderScreen.run()
                            if(isOrderComplete) break@mainLoop //6. 주문 완료 화면
                        }
                        "b" -> continue@takeOutLoop //1. 먹고가기/포장하기 화면
                        "q" -> continue@firstLoop //0. 첫 화면

                        else -> selectMenuScreen.run(mainResult) //3. 메뉴 선택 화면
                    }
                }
                //6. 주문 완료 화면
                orderCompleteScreen.run()
            }
        }

    }
}