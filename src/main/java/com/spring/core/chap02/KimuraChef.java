package com.spring.core.chap02;

import org.springframework.stereotype.Component;

@Component(value = "kc")
public class KimuraChef implements Chef {
    public void cook(){
        System.out.println("키무라 어쩌구");
    }
}
