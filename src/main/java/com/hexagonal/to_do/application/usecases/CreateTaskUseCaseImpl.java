package com.hexagonal.to_do.application.usecases;

import com.hexagonal.to_do.domain.models.Task;
import com.hexagonal.to_do.domain.ports.in.CreateTaskUseCase;
import com.hexagonal.to_do.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
