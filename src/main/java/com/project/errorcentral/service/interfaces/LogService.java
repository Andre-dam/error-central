package com.project.errorcentral.service.interfaces;

import com.project.errorcentral.entity.Log;
import java.util.Optional;

public interface LogService {
    Optional<Log> findById(Long id);
}
