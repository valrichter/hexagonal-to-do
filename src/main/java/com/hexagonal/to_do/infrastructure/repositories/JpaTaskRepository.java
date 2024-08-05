package com.hexagonal.to_do.infrastructure.repositories;

import com.hexagonal.to_do.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}
