package com.project.errorcentral.fixtures;

import com.project.errorcentral.entity.User;

public class UserFixture {
    public static User.UserBuilder basicUserBuilder() {
        return User.builder()
                .name("John")
                .password("some-password")
                .email("john.doe@gmail.com");
    }
}
