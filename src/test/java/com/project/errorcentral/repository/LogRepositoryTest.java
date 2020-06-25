package com.project.errorcentral.repository;

import com.project.errorcentral.entity.Application;
import com.project.errorcentral.entity.Log;
import com.project.errorcentral.entity.User;
import com.project.errorcentral.fixtures.ApplicationFixture;
import com.project.errorcentral.fixtures.LogFixture;
import com.project.errorcentral.fixtures.UserFixture;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LogRepositoryTest extends TestCase {
    @Autowired
    LogRepository logRepository;

    @After
    public void clean() {
        logRepository.deleteAll();
    }

    @Test
    public void saveMethod() {
        User userOwner = UserFixture.buildBasicUser();
        Application app = ApplicationFixture.buildApplicationWithUser(userOwner);
        Log log = LogFixture.buildLogWithApp(app);

        Log persistedLog = logRepository.save(log);

        assertEquals(log, persistedLog);
        assertEquals(log.getApplication(), persistedLog.getApplication());
        assertNotNull(log.getCreatedAt());
    }
}