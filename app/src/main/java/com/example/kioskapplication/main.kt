package com.example.kioskapplication

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {

    var orderList = ArrayList<Order>()
    val dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    var inputNum1 : String

    while (true) {

//        println("SHAKESHACK BURGER 에 오신걸 환영합니다.")
//        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
//        println("")
//        println("[SHAKESHACK MENU]")
//        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
//        println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
//        println("3. Drinks          | 매장에서 직접 만드는 음료")
//        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
//        println("0. Exit            | 프로그램 종료")

        Menu().mainMenu()

        val menu = readln()

        if (!menu.isNumeric()) {
            println("잘못된 번호를 입력했어요 다시 입력해주세요.")
            continue
        }

        when(menu.toInt()) {
            1 -> {
//                println("[Burgers MENU]")
//                println("1. Shackburger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
//                println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
//                println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
//                println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
//                println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
//                println("0. Back          | 뒤로가기")
                Menu().burgerMenu()

                while (true) {
                    val num = readln()

                    if (!num.isNumeric()) {
                        println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                        continue
                    } else {
                        when(num.toInt()) {
                            1 -> {
                                println("1. Shackburger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
                                println("위 메뉴를 장비구니에 추가하시겠습니까?")
                                println("1. 확인          2. 취소")
                                while (true) {
                                    val orderMenu = readln()

                                    if (!orderMenu.isNumeric()) {
                                        println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                                        continue
                                    } else {
                                        when(orderMenu.toInt()) {
                                            1 -> {
                                                println("Shackburger가 장비구니에 추가되었습니다.")

//                                                Order("Shackburger", 6.9)
                                                val name = "Shackburger"
                                                var list = orderList.find { it.name == name }
                                                if (list == null) {
                                                    list = Order(name = name)
//                                                    orderList.add(name, price, description)
                                                }

                                                Menu().mainMenu()
                                                Menu().orderMenu()

                                                while (true) {
                                                    val orderNum = readln()
                                                    if (!num.isNumeric()) {
                                                        println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                                                        continue
                                                    } else {
                                                        when(orderNum.toInt()) {
                                                            5 -> {
                                                                Menu().orderCheck()
                                                                println("$orderList")

                                                            }

                                                            2 -> {
                                                                break
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            0 -> {
                                                break
                                            }

                                        }
                                    }
                                }
                            }

                            2 -> {

                            }

                            3 -> {

                            }

                            4 -> {

                            }

                            0 -> {
                                break
                            }

                        }
                    }
                }


            }

            2 -> {

            }

            3 -> {

            }

            4 -> {

            }

            0 -> {
                println("프로그램을 종료합니다.")
                return
            }
        }
    }
}

fun String.isNumeric(): Boolean {
    return try {
        this.toInt()
        true
    } catch (e: Exception) {
        false
    }
}

//when(num.toInt()) {
//    1 -> {
//
//    }
//
//    2 -> {
//
//    }
//
//    3 -> {
//
//    }
//
//    4 -> {
//
//    }
//
//    5 -> {
//
//    }
//
//    0 -> {
//
//    }
//
//}