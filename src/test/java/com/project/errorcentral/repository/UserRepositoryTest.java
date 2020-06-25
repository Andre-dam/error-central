package com.project.errorcentral.repository;

import com.project.errorcentral.entity.User;
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
public class UserRepositoryTest extends TestCase {
    @Autowired
    UserRepository userRepository;

    @After
    public void clean() {
        userRepository.deleteAll();
    }

    @Test
    public void saveMethod() {
        User user1 = UserFixture.buildBasicUser();
        User persistedUser = userRepository.save(user1);

        assertEquals(user1, persistedUser);
        assertNotNull(persistedUser.getCreatedAt());
    }
}