package com.example.kiosk

import android.annotation.SuppressLint
import java.util.Timer
import kotlin.concurrent.schedule

@SuppressLint("SuspiciousIndentation")
// 메인 메뉴판 화면
// 메뉴 선택시 상세 메뉴화면으로 이동
// 잘못된 번호 선택 시 예외처리
// 프로그램 종료을 위한 번호 정의

fun main() {
    //메뉴 리스트 담기 (9개)
    var menuList = arrayListOf<Food>()
    menuList.add(Food(1,"ShackBurger", 6900,"흔들어 먹는 버거"))
    menuList.add(Food(2,"SmokeShack", 8900,"숫불향이 들어간 버거"))
    menuList.add(Food(3,"Shroom Burger", 9400,"버섯이 들어간 버거"))
    menuList.add(Food(1,"Vanila", 2000,"바닐라맛 아이스크림"))
    menuList.add(Food(2,"Chocolate", 2500,"초콜릿맛 아이스크림"))
    menuList.add(Food(3,"Strawberry", 2500,"딸기맛 아이스크림"))
    menuList.add(Food(1,"Shack Made Lemonade", 3900,"쉑쉑이 직접만든 레모네이드"))
    menuList.add(Food(2,"Fresh Brewed Iced Tea", 3400,"신선한 아이스티"))
    menuList.add(Food(3,"Fifty/Fifty", 3500,"레몬맛 아이스티"))

    var orderList = arrayListOf<Food>()

    // 메인메뉴 보여주기
    MainMenu().displayInfo()


    // 각 메뉴 보여주기
    while (true) {
        try{
            var selectNum = readLine()!!.toInt()
            when (selectNum) {
                1 -> {
                    println("원하는 버거를 선택해주세요")
                    menuList.get(0).displayInfo()
                    menuList.get(1).displayInfo()
                    menuList.get(2).displayInfo()
                    var choose = readLine()!!.toInt()
                    when(choose) {
                        1 -> {println("${menuList.get(0).name}을 선택하셨습니다. 장바구니에 담으시겠습니까?")
                            println("1번 장바구니 담기, 2번 취소")
                            var select = readLine()!!.toInt()
                            when(select) {
                                1 -> {
                                    println("장바구니에 담았습니다.")
                                    orderList.add(menuList.get(0))
                                }
                                2 -> {
                                    println("취소하셨습니다.")
                                    Timer().schedule(1500) { return@schedule main()}
                                }
                            }
                        }
                        2 -> {println("${menuList.get(1).name}을 선택하셨습니다. 장바구니에 담으시겠습니까?")
                            println("1번 장바구니 담기, 2번 취소")
                            var select = readLine()!!.toInt()
                            when(select) {
                                1 -> {
                                    println("장바구니에 담았습니다.")
                                    orderList.add(menuList.get(1))
                                }
                                2 -> {
                                    println("취소하셨습니다.")
                                    Timer().schedule(1500) { return@schedule main()}
                                }
                            }}
                        3 -> {println("${menuList.get(2).name}을 선택하셨습니다. 장바구니에 담으시겠습니까?")
                            println("1번 장바구니 담기, 2번 취소")
                            var select = readLine()!!.toInt()
                            when(select) {
                                1 -> {
                                    println("장바구니에 담았습니다.")
                                    orderList.add(menuList.get(2))
                                }
                                2 -> {
                                    println("취소하셨습니다.")
                                    Timer().schedule(1500) { return@schedule main()}
                                }
                            }}
                    }
                    break
                }
                2 -> {
                    println("원하는 아이스크림을 선택해주세요")
                    menuList.get(3).displayInfo()
                    menuList.get(4).displayInfo()
                    menuList.get(5).displayInfo()
                    var choose = readLine()!!.toInt()
                    when(choose) {
                        1 -> {println("${menuList.get(3).name}을 선택하셨습니다. 장바구니에 담으시겠습니까?")
                            println("1번 장바구니 담기, 2번 취소")
                            var select = readLine()!!.toInt()
                            when(select) {
                                1 -> {
                                    println("장바구니에 담았습니다.")
                                    orderList.add(menuList.get(3))
                                }
                                2 -> {
                                    println("취소하셨습니다.")
                                    Timer().schedule(1500) { return@schedule main()}
                                }
                            }}
                        2 -> {println("${menuList.get(4).name}을 선택하셨습니다. 장바구니에 담으시겠습니까?")
                            println("1번 장바구니 담기, 2번 취소")
                            var select = readLine()!!.toInt()
                            when(select) {
                                1 -> {
                                    println("장바구니에 담았습니다.")
                                    orderList.add(menuList.get(4))
                                }
                                2 -> {
                                    println("취소하셨습니다.")
                                    Timer().schedule(1500) { return@schedule main()}
                                }
                            }}
                        3 -> {println("${menuList.get(5).name}을 선택하셨습니다. 장바구니에 담으시겠습니까?")
                            println("1번 장바구니 담기, 2번 취소")
                            var select = readLine()!!.toInt()
                            when(select) {
                                1 -> {
                                    println("장바구니에 담았습니다.")
                                    orderList.add(menuList.get(5))
                                }
                                2 -> {
                                    println("취소하셨습니다.")
                                    Timer().schedule(1500) { return@schedule main()}
                                }
                            }}
                    }
                    break
                }
                3 -> {
                    println("원하는 음료를 선택해주세요")
                    menuList.get(6).displayInfo()
                    menuList.get(7).displayInfo()
                    menuList.get(8).displayInfo()
                    var choose = readLine()!!.toInt()
                    when(choose) {
                        1 -> {println("${menuList.get(6).name}을 선택하셨습니다. 장바구니에 담으시겠습니까?")
                            println("1번 장바구니 담기, 2번 취소")
                            var select = readLine()!!.toInt()
                            when(select) {
                                1 -> {
                                    println("장바구니에 담았습니다.")
                                    orderList.add(menuList.get(6))
                                }
                                2 -> {
                                    println("취소하셨습니다.")
                                    Timer().schedule(1500) { return@schedule main()}
                                }
                            }}
                        2 -> {println("${menuList.get(7).name}을 선택하셨습니다. 장바구니에 담으시겠습니까?")
                            println("1번 장바구니 담기, 2번 취소")
                            var select = readLine()!!.toInt()
                            when(select) {
                                1 -> {
                                    println("장바구니에 담았습니다.")
                                    orderList.add(menuList.get(7))
                                }
                                2 -> {
                                    println("취소하셨습니다.")
                                    Timer().schedule(1500) { return@schedule main()}
                                }
                            }}
                        3 -> {println("${menuList.get(8).name}을 선택하셨습니다. 장바구니에 담으시겠습니까?")
                            println("1번 장바구니 담기, 2번 취소")
                            var select = readLine()!!.toInt()
                            when(select) {
                                1 -> {
                                    println("장바구니에 담았습니다.")
                                    orderList.add(menuList.get(8))
                                }
                                2 -> {
                                    println("취소하셨습니다.")
                                    Timer().schedule(1500) { return@schedule main()}
                                }
                            }}
                    }
                    break
                }
                0 -> {
                    println("주문을 종료합니다.")
                    break
                }
                else -> {
                    println("다시 입력해주세요\n")
                    Timer().schedule(800){return@schedule main()}
                }
            }
        }   catch (e: NumberFormatException) {
            println("아무것도 입력하지 않으셨습니다. 번호를 보고 다시 입력해주세요\n")
            Timer().schedule(800){return@schedule main()}
        }
    }



    println("장바구니 확인")
    for (i in 0..orderList.size-1) {
        println("순서 ${i+1} : ${orderList[i].name}, ${orderList[i].price}원")
    }

    println("최종결제 하시겠습니까?")
    println("1번 예, 2번 아니요(메뉴)")
    try {
        var pay = readLine()!!.toInt()
        when(pay) {
            1 -> println("결제되었습니다.")
            2 -> return MainMenu().displayInfo()
        }
    } catch (e: NumberFormatException) {
        println("잘못입력하였습니다.")
    }








}

