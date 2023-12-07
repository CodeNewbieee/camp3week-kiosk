package com.example.kiosk.menu

class MyMenu(){
    val burgerMenuItemCollection = MenuItemCollection()
    val frozenCustardMenuItemCollection = MenuItemCollection()
    val drinksMenuItemCollection = MenuItemCollection()
    val beerMenuItemCollection = MenuItemCollection()

    val myMenuCollections by lazy{
        listOf(burgerMenuItemCollection,
            frozenCustardMenuItemCollection,
            drinksMenuItemCollection,
            beerMenuItemCollection)
    }

    init{
        initBurgerMenuItemCollection()
        initFrozenCustardMenuItemCollection()
        initDrinksMenuItemCollection()
        initBeerMenuItemCollection()
    }

    fun printMyMenuCollections(){
        for(i in 0 until myMenuCollections.size){
            var printString = "${i+1}. "
            myMenuCollections[i].apply{
                printString += "${this.collectionName!!}"
                if(this.collectionDescription != null) printString += " - ${this.collectionDescription}"
            }
            println(printString)
        }
    }

    private fun initBurgerMenuItemCollection() {
        burgerMenuItemCollection.apply{
            collectionName = "Burgers"
            collectionDescription = "100% 앵거스 비프 통살을 다져 만든 패티와 쫄깃한 식감의 포테이토 번을 사용한 버거"
            addMenuItem(MenuItem("Shack Burger", 6900,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"))
            addMenuItem(MenuItem("Smoke Burger", 8900,"애플 우드 칩으로 훈연한 베이컨, 매콤한 체리 페퍼에 쉑소스가 토핑된 치즈버거"))
            addMenuItem(MenuItem("Shroom Burger", 9400,"몬스터 치즈와 체다 치즈로 속을 채우고 바삭하게 튀겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쉑소스를 올린 베지테리안 버거"))
            addMenuItem(MenuItem("Shack Shack Burger", 12400,"슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴"))
            addMenuItem(MenuItem("Cheese Burger", 6900,"포테이토 번과 비프 패티, 치즈가 토핑된 치즈버거"))
            addMenuItem(MenuItem("Hamburger", 5400,"포테이토 번과 비프 패티를 기본으로 신선한 양상추, 토마토 피클, 양파 토핑을 취향에 따라 선택할 수 있는 버거"))
        }
    }
    private fun initFrozenCustardMenuItemCollection() {
        frozenCustardMenuItemCollection.apply{
            collectionName = "Frozen Custard"
            collectionDescription = "매일 매장에서 신선하게 직접 만드는 부드럽고 진한 맛의 쫀득한 아이스크림"
            addMenuItem(MenuItem("Shakes", 5900, "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피"))
            addMenuItem(MenuItem("Shake of the Week", 6500, "특별한 커스터드 플레이버"))
            addMenuItem(MenuItem("Red Bean Shake", 6500, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크"))
            addMenuItem(MenuItem("Floats", 5900, "루트 비어, 퍼플 카우, 크림시클"))
            addMenuItem(MenuItem("Cups & Cones", 4900, "바닐라, 초콜렛, Flavor of the Week"))
            addMenuItem(MenuItem("Concretes", 5900, "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합"))
        }
    }
    private fun initDrinksMenuItemCollection(){
        drinksMenuItemCollection.apply {
            collectionName = "Drinks"
            addMenuItem(MenuItem("Shack-made Lemonade", 3900, "매장에서 직접 만드는 상큼한 레몬에이드"))
            addMenuItem(MenuItem("Fresh Brewed Iced Tea", 3400, "직접 유기농 홍차를 우려낸 아이스티"))
            addMenuItem(MenuItem("Fifty/Fifty", 3500, "레몬에이드와 아이스티의 만남"))
            addMenuItem(MenuItem("Fountain Soda", 2700, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프"))
            addMenuItem(MenuItem("Abita Root Beer", 4400, "청량감 있는 독특한 미국식 무알콜 탄산음료"))
            addMenuItem(MenuItem("Bottled Water", 1000, "지리산 암반대수층으로 만든 프리미엄 생수"))
        }
    }
    private fun initBeerMenuItemCollection(){
        beerMenuItemCollection.apply {
            collectionName = "Beer"
            addMenuItem(MenuItem("ShackMeister Ale", 9800, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"))
            addMenuItem(MenuItem("Magpie Brewing Co.", 6800, null))
            addMenuItem(MenuItem("The Hand and Malt", 6800, null))
        }
    }

}