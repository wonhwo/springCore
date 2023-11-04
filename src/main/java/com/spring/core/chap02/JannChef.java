package com.spring.core.chap02;

import org.springframework.stereotype.Component;

@Component(value = "jc")
public class JannChef implements Chef {
    public void cook(){
        System.out.println("쟝 셰프가 에스카르고를 합니다");
    }
}
