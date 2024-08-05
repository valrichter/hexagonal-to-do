package com.hexagonal.to_do.domain.ports.in;

import com.hexagonal.to_do.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTaskById(Long id);
    List<Task> getAllTasks();

}
