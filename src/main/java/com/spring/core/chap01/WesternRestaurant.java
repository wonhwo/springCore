package com.spring.core.chap01;

import lombok.NoArgsConstructor;

//@NoArgsConstructor //기본 생성자
public class WesternRestaurant implements Restaurant {
    //의존 객체
    private final Chef chef;
    private FrenchCorse frenchCorse = new FrenchCorse();

    public WesternRestaurant(Chef chef) {
        this.chef = chef;

    }


    //요리를 주문하는 기능
    public void order(){
        System.out.println("양식 요리 주문");
        // 요리 코스 메뉴 구성
        //요리사에게 요리 명령을 내려야함
        chef.cook();
        frenchCorse.combineMenu();
    }
}
