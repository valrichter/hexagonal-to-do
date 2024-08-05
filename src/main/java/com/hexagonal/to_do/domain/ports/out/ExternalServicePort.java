package com.hexagonal.to_do.domain.ports.out;

import com.hexagonal.to_do.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
