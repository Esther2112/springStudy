package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EasternRestaurant implements Restaurant {

    //쉐프
    private Chef chef;

    //요리 코스
    private Course course;

    @Autowired
    //생성자 주입
    public EasternRestaurant(
            @Qualifier("kc") Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    //수정자 수입
    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    //요리를 주문하는 기능
    @Override
    public void order(){
        System.out.println("아시안 요리를 주문합니다");
        course.combineMenu();
        chef.cook();
    }

}
