package com.spring.core.person;

import lombok.*;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
//@Data //실무에서는 안 쓰는게 좋음. 상황에 따라 모든 필드를 생성하지 않을 수 있으니까!
public class Person {

    private String nickname;
    private String address;
    private int age;

}
