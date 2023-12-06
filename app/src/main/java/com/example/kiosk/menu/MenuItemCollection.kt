package com.example.kiosk.menu

class MenuItemCollection(){
    var collectionName:String? = null
    var collectionDescription:String? = null
    var menuItemList = arrayOf<MenuItem>()

    fun getSize() = menuItemList.size

    fun printMenuItems(){
        for(i in 0 until menuItemList.size){
            var printString = "${i+1}. "
            menuItemList[i].apply {
                printString +=  "${this.name} - ${this.cost}"
                if(this.description != null) printString += " - ${this.description}"
            }
            println(printString)
        }
    }
}