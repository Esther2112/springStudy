package com.spring.core.chap04;

public class WesternRestaurant implements Restaurant {

    //쉐프
    private Chef chef;

    //요리 코스
    private Course course;

    public WesternRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    //요리를 주문하는 기능
    @Override
    public void order(){
        System.out.println("서양 요리를 주문합니다");
        course.combineMenu();
        chef.cook();
    }

}
