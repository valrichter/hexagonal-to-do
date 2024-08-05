package com.hexagonal.to_do.application.usecases;

import com.hexagonal.to_do.domain.models.AdditionalTaksInfo;
import com.hexagonal.to_do.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.hexagonal.to_do.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaksInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
