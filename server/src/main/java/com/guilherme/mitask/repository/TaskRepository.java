package com.guilherme.mitask.repository;

import com.guilherme.mitask.model.Task;
import com.guilherme.mitask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query(value = "SELECT * FROM tasks t WHERE t.user_id = :idUser", nativeQuery = true)
    List<Task> findAllByUser(@Param("idUser") Long idUser);
}
