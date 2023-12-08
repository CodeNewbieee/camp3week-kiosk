package com.example.kiosk.screen

import com.example.kiosk.MyKiosk
import com.example.kiosk.R
import com.example.kiosk.menu.MenuItemCollection
import com.example.kiosk.menu.MenuItem
import java.nio.file.WatchEvent.Kind

class SelectMenuScreen: Screen() {
    var menuItemCollection: MenuItemCollection? = null
    override fun run(menuResult:String){
        menuItemCollection =  MyKiosk.myMenu.myMenuCollections[menuResult.toInt()-1]

        while(true){
            val input = getInput()
            if(input == "b") return

            //선택한 메뉴 장바구니에 추가
            val selectedMenuItem = menuItemCollection!!.getMenuItemAt(input.toInt()-1)
            println("선택한 메뉴는 ${selectedMenuItem.name} 입니다.")

            MyKiosk.shoppingCart.addMenuItem(selectedMenuItem)
            MyKiosk.taskDelayManager.delayTask3seconds("장바구니에 담기")
        }
    }

    override fun getInput():String{
        var possibleInputs = arrayOf("b")
        for(i in 1..menuItemCollection!!.getSize()) possibleInputs += i.toString()

        var input = ""
        while(true){
            printScreen()
            input = readLine()?.toString() ?: ""
            if(possibleInputs.contains(input)) break
            else println("잘못된 입력입니다.")
        }
        return input
    }

    override fun printScreen(){
        println("[${menuItemCollection!!.collectionName} 메뉴 선택 화면]")
        println("주문할 메뉴를 선택하세요.")
        menuItemCollection!!.printMenuItems()
        println("b: 뒤로 가기 - 메인 화면으로 돌아갑니다.")
        print("->")
    }
}