package com.project.errorcentral.service.interfaces;

import com.project.errorcentral.entity.Application;
import com.project.errorcentral.repository.ApplicationRepository;
import com.project.errorcentral.service.impl.ApplicationServiceImpl;
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
public class ApplicationServiceTest extends TestCase {
    @Mock
    ApplicationRepository applicationRepository;

    @InjectMocks
    ApplicationServiceImpl applicationService;

    @Test
    public void findByIdMethod() {
        Application app = Mockito.mock(Application.class);
        when(applicationRepository.findById(1L)).thenReturn(Optional.of(app));

        Optional<Application> result = applicationService.findById(1L);
        assertEquals(result.get(), app);
    }
}