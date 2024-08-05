package com.hexagonal.to_do.domain.ports.in;

public interface DeleteTaskUseCase {
    boolean deleteTask(Long id);
}
