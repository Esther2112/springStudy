package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("kc") //@Component("kc")의 형식으로 이름을 지정할수 있고 생략시 camel case로 클래스이름을 가져감
public class KimuraChef implements Chef {

    @Override
    public void cook(){
        System.out.println("일식 요리의 대가 키무라입니다");
    }
}
