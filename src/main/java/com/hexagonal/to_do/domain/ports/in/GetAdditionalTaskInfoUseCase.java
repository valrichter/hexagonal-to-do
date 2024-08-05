package com.hexagonal.to_do.domain.ports.in;

import com.hexagonal.to_do.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
