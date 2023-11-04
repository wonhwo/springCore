package com.spring.core.chap02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.chap02")
//@Compnent가 붙은 크랠스들을 스캔해서 빈으로 자동 등록시킴
public class HotelManager {


}
