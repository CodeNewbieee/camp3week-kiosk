package com.example.kioskapplication

class Menu() {

    fun mainMenu() {
        println("SHAKESHACK BURGER 에 오신걸 환영합니다.")
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
        println("")
        println("[SHAKESHACK MENU]")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("0. Exit | 프로그램 종료")
    }

    fun burgerMenu() {
        println("[Burgers MENU]")
        println("1. Shackburger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
        println("0. Back          | 뒤로가기")
    }

    fun icecreamMenu() {
        println("[Frozen Custard MENU]")
        println("1. Shakes            | W 5.9 | 바닐라, 초콜릿, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피")
        println("2. Shake of the Week | W 6.5 | 특별한 커스터드 플레이버")
        println("3. Red Bean Shake    | W 6.5 | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크")
        println("4. Floats            | W 5.9 | 루트 비어, 퍼플 카우, 크림시클")
        println("5. Cups & Cones      | W 4.9 | 바닐라, 초콜렛, Flavor of the Week")
        println("6. Concretes         | W 5.9 | 쉐이스퀙의 쫀득한 커스터드와 다양한 믹스-인의 조합")
        println("7. Shack Attack      | W 6.9 | 초콜렛 퍼지 소스, 초콜렛 트러플 쿠키, Lumiere 초콜렛 청크와 스프링클이 들어간 진한 초콜렛 커스터드")
        println("0. Back              | 뒤로가기")
    }

    fun drinkMenu() {
        println("[Drinks MENU]")
        println("1. Shack-made Lemonade   | W 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)")
        println("2. Fresh Brewed Iced Tea | W 3.4 | 직접 유기농 홍차를 우려낸 아이스티")
        println("3. Fifty/Fifty           | W 3.5 | 레몬에이드와 아이스티의 만남")
        println("4. Fountain Soda         | W 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프")
        println("5. Abita Root Beer       | W 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료")
        println("6. Bottled Water         | W 1.0 | 지리산 암반대수층으로 만든 프리미엄 생수")
        println("0. Back                  | 뒤로가기")
    }

    fun beerMenu() {
        println("[Beer MENU]")
        println("1. ShackMeister Ale  | W 9.8 | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주")
        println("2. Magpie Brewing    | W 6.8 | 페일 에일, 드래프트")
        println("0. Back          | 뒤로가기")
    }


}