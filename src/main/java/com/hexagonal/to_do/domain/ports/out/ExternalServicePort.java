package com.hexagonal.to_do.domain.ports.out;

import com.hexagonal.to_do.domain.models.AdditionalTaksInfo;

public interface ExternalServicePort {
    AdditionalTaksInfo getAdditionalTaskInfo(Long taskId);
}
