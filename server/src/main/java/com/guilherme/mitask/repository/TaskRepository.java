package com.guilherme.mitask.repository;

import com.guilherme.mitask.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
