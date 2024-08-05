package com.hexagonal.to_do.application.services;

import com.hexagonal.to_do.domain.models.AdditionalTaksInfo;
import com.hexagonal.to_do.domain.models.Task;
import com.hexagonal.to_do.domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class taskService implements CreateTaskUseCase, DeleteTaskUseCase, UpdateTaskUseCase, RetrieveTaskUseCase, GetAdditionalTaskInfoUseCase {

    @Override
    public Task createTask(Task task) {
        return null;
    }

    @Override
    public boolean deleteTask(Long id) {
        return false;
    }

    @Override
    public AdditionalTaksInfo getAdditionalTaskInfo(Long id) {
        return null;
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> getAllTasks() {
        return List.of();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return Optional.empty();
    }
}
