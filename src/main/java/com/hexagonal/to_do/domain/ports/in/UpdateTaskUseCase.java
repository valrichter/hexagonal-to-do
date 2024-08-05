package com.hexagonal.to_do.domain.ports.in;

import com.hexagonal.to_do.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updatedTask);
}
