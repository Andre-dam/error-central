package com.project.errorcentral.service.interfaces;

import com.project.errorcentral.entity.Log;
import com.project.errorcentral.repository.LogRepository;
import com.project.errorcentral.service.impl.LogServiceImpl;
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
public class LogServiceTest extends TestCase {
    @Mock
    LogRepository logRepository;

    @InjectMocks
    LogServiceImpl logService;

    @Test
    public void findByIdMethod() {
        Log log = Mockito.mock(Log.class);
        when(logRepository.findById(1L)).thenReturn(Optional.of(log));

        Optional<Log> result = logService.findById(1L);
        assertEquals(result.get(), log);
    }
}