package com.spring.core.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    //테스트 메서드 생성
    @Test
    void lombokTest(){
        Person p = new Person();
        p.setAddress("Seoul");
        p.setAge(10);
        p.setNickname("Okaring");
        System.out.println(p);
    }
}