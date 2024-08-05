package com.hexagonal.to_do.infrastructure.config;

import com.hexagonal.to_do.application.usecases.*;
import com.hexagonal.to_do.domain.models.AdditionalTaksInfo;
import com.hexagonal.to_do.domain.ports.out.ExternalServicePort;
import com.hexagonal.to_do.infrastructure.adapters.ExternalServiceAdapter;
import com.hexagonal.to_do.infrastructure.adapters.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hexagonal.to_do.domain.ports.in.*;
import com.hexagonal.to_do.domain.ports.out.TaskRepositoryPort;
import com.hexagonal.to_do.application.services.TaskService;


@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
                );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

//    @Bean
//    public ExternalServicePort externalServicePort() {
//        return new ExternalServiceAdapter();
//    }
}
