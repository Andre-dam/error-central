package com.project.errorcentral.service.impl;

import com.project.errorcentral.entity.Application;
import com.project.errorcentral.repository.ApplicationRepository;
import com.project.errorcentral.service.interfaces.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    ApplicationRepository applicationRepository;

    @Override
    public Optional<Application> findById(Long id) {
        return applicationRepository.findById(id);
    }
}
