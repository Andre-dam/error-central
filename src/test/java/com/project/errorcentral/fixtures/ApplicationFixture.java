package com.project.errorcentral.fixtures;

import com.project.errorcentral.entity.Application;
import com.project.errorcentral.entity.User;

public class ApplicationFixture {
    private static Application.ApplicationBuilder basicApplicationBuilder() {
        return Application.builder()
                .name("some-application");
    }

    public static Application buildApplicationWithUser(User appOwner) {
        return basicApplicationBuilder().user(appOwner).build();
    }
}
