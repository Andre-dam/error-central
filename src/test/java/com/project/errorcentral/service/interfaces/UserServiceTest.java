package com.project.errorcentral.service.interfaces;

import com.project.errorcentral.entity.User;
import com.project.errorcentral.repository.UserRepository;
import com.project.errorcentral.service.impl.UserServiceImpl;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest extends TestCase {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;

    @Test
    public void findByIdMethod() {
        User user = Mockito.mock(User.class);
        when(userRepository.findById("john.doe@gmail.com")).thenReturn(Optional.of(user));

        Optional<User> result = userService.findById("john.doe@gmail.com");
        assertEquals(result.get(), user);
    }
}