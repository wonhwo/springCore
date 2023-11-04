package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@NoArgsConstructor //기본 생성자
@Component//호텔메니저에게 객체 생성을 맡김
public class WesternRestaurant implements Restaurant {
    //의존 객체
    private final Chef chef;
    private FrenchCorse frenchCorse = new FrenchCorse();

    @Autowired //스프링에 빈으로 등록된 의존객체를 알아서 넣어줌
    public WesternRestaurant(@Qualifier("jc") Chef chef) {
        this.chef = chef;
    }


    //요리를 주문하는 기능
    public void order() {
        System.out.println("양식 요리 주문");
        // 요리 코스 메뉴 구성
        //요리사에게 요리 명령을 내려야함
        chef.cook();
        frenchCorse.combineMenu();
    }
}
