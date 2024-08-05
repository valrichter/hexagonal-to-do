package com.hexagonal.to_do.domain.ports.in;

import com.hexagonal.to_do.domain.models.AdditionalTaksInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaksInfo getAdditionalTaskInfo(Long id);

}
