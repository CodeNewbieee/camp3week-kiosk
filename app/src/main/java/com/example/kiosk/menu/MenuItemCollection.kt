package com.example.kiosk.menu

class MenuItemCollection(){
    var collectionName:String? = null
    var collectionDescription:String? = null
    private var menuItemList = arrayOf<MenuItem>()

    fun getSize() = menuItemList.size
    fun isEmpty():Boolean = menuItemList.isEmpty()
    fun addMenuItem(menuItem: MenuItem){
        menuItemList += menuItem
    }
    fun removeMenuItemAt(index: Int){
        menuItemList = menuItemList.filterIndexed{i, menuItem -> i != index}.toTypedArray()
    }
    fun getMenuItemAt(index: Int):MenuItem{
        return menuItemList[index]
    }
    fun clearMenuItemList() {
        menuItemList = arrayOf<MenuItem>()
    }

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

    fun getCostSum(): Int {
        var costSum = 0
        for(menuItem in menuItemList) costSum += menuItem.cost
        return costSum
    }

}