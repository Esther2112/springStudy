package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hotel {

    //제어의 역전(IoC): 객체 생성의 제어권을 외부로 넘긴다. -> Setter & 생성자
    //의존성 주입(DO) : 외부에서 생성된 객체를 주입받는 개념
    //레스토랑 객체에 의존
    private Restaurant restaurant;

    //헤드쉐프
    private Chef headChef;

    public Hotel() {

    }
    @Autowired //컨테이너에 등록된 객체를 알아서 주입좀 해줘
    //생성자 주입
    public Hotel(Restaurant restaurant, @Qualifier("kc") Chef headChef) {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

    //호텔의 정보를 알려주는 기능
    public void inform(){
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 헤드셰프는 %s입니다\n"
                        , restaurant.getClass().getSimpleName()
                        , headChef.getClass().getSimpleName());
        restaurant.order();
    }
}
