package com.example.kiosk.screen

open abstract class Screen {
    open fun run():String = ""
    open fun run(menuResult:String){}
    protected abstract fun getInput():String
    protected abstract fun printScreen()
}