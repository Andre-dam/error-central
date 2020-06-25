package com.project.errorcentral.fixtures;

import com.project.errorcentral.entity.Application;
import com.project.errorcentral.entity.User;

public class ApplicationFixture {
    public static Application.ApplicationBuilder basicApplicationBuilder(User appOwner) {
        return Application.builder()
                .user(appOwner)
                .name("some-application");
    }
}
