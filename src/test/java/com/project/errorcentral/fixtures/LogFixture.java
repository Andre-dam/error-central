package com.project.errorcentral.fixtures;

import com.project.errorcentral.entity.Application;
import com.project.errorcentral.entity.Level;
import com.project.errorcentral.entity.Log;

import java.time.LocalDateTime;

public class LogFixture {
    private static Log.LogBuilder basicLogBuilder() {
        return Log.builder()
                .description("some-service-description")
                .data("some-log-data")
                .count(42)
                .eventDate(LocalDateTime.now())
                .level(Level.INFO);
    }

    public static Log buildLogWithApp(Application app) {
        return basicLogBuilder().application(app).build();
    }
}