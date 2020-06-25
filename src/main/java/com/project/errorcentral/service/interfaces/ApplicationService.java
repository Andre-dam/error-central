package com.project.errorcentral.service.interfaces;

import com.project.errorcentral.entity.Application;

import java.util.Optional;

public interface ApplicationService {
    Optional<Application> findById(Long id);
}
