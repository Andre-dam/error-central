package com.project.errorcentral.repository;

import com.project.errorcentral.entity.Application;
import com.project.errorcentral.entity.User;
import com.project.errorcentral.fixtures.ApplicationFixture;
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
public class ApplicationRepositoryTest extends TestCase {
    @Autowired
    ApplicationRepository applicationRepository;

    @After
    public void clean() {
        applicationRepository.deleteAll();
    }

    @Test
    public void saveMethod() {
        User userOwner = UserFixture.buildBasicUser();
        Application app1 = ApplicationFixture.buildApplicationWithUser(userOwner);
        Application persistedApp = applicationRepository.save(app1);

        assertEquals(app1, persistedApp);
        assertEquals(app1.getUser(), persistedApp.getUser());
        assertNotNull(persistedApp.getCreatedAt());
    }
}