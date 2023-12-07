package com.example.kioskapplication

class Order() {

    var orderList = ArrayList<Common>()

//    val burgerMenu: Array<Burger> = arrayOf<Burger>(
//        Burger(number = 1, name = "Shackburger", price = 6.9, description = "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
//        Burger(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
//        Burger(3, "Shackburger", 6.9, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"),
//        Burger(4, "Shackburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
//        Burger(5, "Shackburger", 6.9, "비프패티를 기반으로 야채가 들어간 기본버거"),
//    )

    fun start() {

        while (true) {

            Menu().mainMenu()
            val menu = readln()

            if (!menu.isNumeric()) {
                println("숫자가 아닙니다. 다시 입력해주세요.")
                continue
            } else if(menu.toInt() < 0 && menu.toInt() > 4) {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                continue
            }

            when(menu.toInt()) {
                1 -> {

                    Menu().burgerMenu()

                    while (true) {
                        val num = readln()

                        if (!num.isNumeric()) {
                            println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            continue
                        } else if(menu.toInt() < 0 && menu.toInt() > 5) {
                            println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            continue
                        } else {
                            when(num.toInt()) {
                                1 -> {
                                    val burger = Burger("Shackburger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")

                                    addCart(burger)
                                }

                                2 -> {
                                    val burger = Burger("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")

                                    addCart(burger)
                                }

                                3 -> {
                                    val burger = Burger("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")

                                    addCart(burger)
                                }

                                4 -> {
                                    val burger = Burger("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")

                                    addCart(burger)
                                }

                                5 -> {
                                    val burger = Burger("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")

                                    addCart(burger)
                                }

                                0 -> {
                                    break
                                }

                            }
                        }
                    }


                }

                2 -> {
                    Menu().icecreamMenu()

                    while (true) {
                        val num = readln()

                        if (!num.isNumeric()) {
                            println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            continue
                        } else if(menu.toInt() < 0 && menu.toInt() > 7) {
                            println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            continue
                        } else {
                            when(num.toInt()) {
                                1 -> {
                                    val icecream = Icecream("Shakes", 5.9, "바닐라, 초콜릿, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피")

                                    addCart(icecream)
                                }

                                2 -> {
                                    val icecream = Icecream("Shake of the Week", 6.5, "특별한 커스터드 플레이버")

                                    addCart(icecream)
                                }

                                3 -> {
                                    val icecream = Icecream("Red Bean Shake", 6.5, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크")

                                    addCart(icecream)
                                }

                                4 -> {
                                    val icecream = Icecream("Floats", 5.9, "루트 비어, 퍼플 카우, 크림시클")

                                    addCart(icecream)
                                }

                                5 -> {
                                    val icecream = Icecream("Cups & Cones", 4.9, "바닐라, 초콜렛, Flavor of the Week")

                                    addCart(icecream)
                                }

                                6 -> {
                                    val icecream = Icecream("Concretes", 5.9, "쉐이스퀙의 쫀득한 커스터드와 다양한 믹스-인의 조합")

                                    addCart(icecream)
                                }

                                7 -> {
                                    val icecream = Icecream("Shack Attack", 6.9, "초콜렛 퍼지 소스, 초콜렛 트러플 쿠키, Lumiere 초콜렛 청크와 스프링클이 들어간 진한 초콜렛 커스터드")

                                    addCart(icecream)
                                }

                                0 -> {
                                    break
                                }

                            }
                        }
                    }
                }

                3 -> {
                    Menu().drinkMenu()

                    while (true) {
                        val num = readln()

                        if (!num.isNumeric()) {
                            println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            continue
                        } else if(menu.toInt() < 0 && menu.toInt() > 6) {
                            println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            continue
                        } else {
                            when(num.toInt()) {
                                1 -> {
                                    val drink = Drink("Shack-made Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)")

                                    addCart(drink)
                                }

                                2 -> {
                                    val drink = Drink("Fresh Brewed Iced Tea", 3.4, "직접 유기농 홍차를 우려낸 아이스티")

                                    addCart(drink)
                                }

                                3 -> {
                                    val drink = Drink("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남")

                                    addCart(drink)
                                }

                                4 -> {
                                    val drink = Drink("Fountain Soda", 2.7, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프")

                                    addCart(drink)
                                }

                                5 -> {
                                    val drink = Drink("Abita Root Beer", 4.4, "청량감 있는 독특한 미국식 무알콜 탄산음료")

                                    addCart(drink)
                                }

                                6 -> {
                                    val drink = Drink("Bottled Water", 1.0, "지리산 암반대수층으로 만든 프리미엄 생수")

                                    addCart(drink)
                                }

                                0 -> {
                                    break
                                }

                            }
                        }
                    }
                }

                4 -> {
                    Menu().drinkMenu()

                    while (true) {
                        val num = readln()

                        if (!num.isNumeric()) {
                            println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            continue
                        } else if(menu.toInt() < 0 && menu.toInt() > 6) {
                            println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            continue
                        } else {
                            when(num.toInt()) {
                                1 -> {
                                    val beer = Beer("ShackMeister Ale", 9.8, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주")

                                    addCart(beer)
                                }

                                2 -> {
                                    val beer = Beer("Magpie Brewing", 6.8, "페일 에일, 드래프트")

                                    addCart(beer)
                                }

                                0 -> {
                                    break
                                }

                            }
                        }
                    }
                }

                0 -> {
                    println("프로그램을 종료합니다.")
                    return
                }
            }

        }
        while (true) {

        }
    }

    fun addCart(order: Common) {
        println()
        println("위 메뉴를 장바구니에 추가하시겠습니까?")
        println("1. 확인              2. 취소")
        while (true) {
            val num = readln()

            if (!num.isNumeric()) {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                continue
            } else if (num.toInt() < 0 && num.toInt() > 5) {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                continue
            } else {
                when (num.toInt()) {
                    1 -> {
                        orderList.add(order)

                        println("${order.name} 가 장바구니에 추가되었습니다.")
                    }

                    2 -> {
                        println("주문을 취소하였습니다. 선택화면으로 돌아갑니다.")

                        break
                    }

                }
            }
        }
    }


    fun orderMenu() {
        println("[ORDER MENU]")
        println("5. Order     | 장바구니를 확인 후 주문합니다.")
        println("0. Cancel    | 진행중인 주문을 취소합니다.")

    }

    fun orderCheck() {
        println("아래와 같이 주문하시겠습니까?")
        println("")
        println("[ ORDERS ]")
    }

    fun String.isNumeric(): Boolean {
        return try {
            this.toInt()
            true
        } catch (e: Exception) {
            false
        }
    }

}

