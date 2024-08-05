package com.hexagonal.to_do.domain.ports.in;

import com.hexagonal.to_do.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
