package com.spring.core.chap02.config;

import com.spring.core.chap02.Hotel;
import org.junit.jupiter.api.Test;

class HotelManagerTest {

    @Test
    void diTest(){
        HotelManager hotelManager = new HotelManager();
        Hotel hotel = hotelManager.hotel();
        hotel.inform();
    }
}