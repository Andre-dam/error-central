package com.project.errorcentral.service.impl;

import com.project.errorcentral.entity.Log;
import com.project.errorcentral.repository.LogRepository;
import com.project.errorcentral.service.interfaces.LogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class LogServiceImpl implements LogService {
    @Autowired
    LogRepository logRepository;

    @Override
    public Optional<Log> findById(Long id) {
        return logRepository.findById(id);
    }
}
