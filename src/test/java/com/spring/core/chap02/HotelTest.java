package com.spring.core.chap02;

import com.spring.core.chap02.config.HotelManager;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelTest {
    AnnotationConfigApplicationContext ctx
            =new AnnotationConfigApplicationContext(HotelManager.class);

    @Test
    void hotelAutoTest(){
        Hotel hotel=ctx.getBean(Hotel.class);
        hotel.reserve();
    }
}
