package com.spring.core.chap01;

import com.spring.core.chap01.config.HotelManager;
import org.junit.jupiter.api.Test;


class HotelTest {
    @Test
    void hotelTest(){
        HotelManager hotelManager = new HotelManager();
        Hotel hotel=hotelManager.hotel();
        hotel.reserve();
    }

}