package com.guilherme.mitask.repository;

import com.guilherme.mitask.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query(value = "SELECT * FROM tasks t WHERE t.user_id = :idUser", nativeQuery = true)
    List<Task> findAllByUser(@Param("idUser") Long idUser);

    @Query(value = "SELECT * FROM tasks WHERE user_id = :idUser AND id = :idTask", nativeQuery = true)
    Task findTask(@Param("idTask") Long idTask, @Param("idUser") Long idUser);

    @Modifying
    @Query(value = "DELETE FROM tasks WHERE user_id = :idUser AND id = :idTask", nativeQuery = true)
    void deleteByTask(@Param("idTask") Long idTask, @Param("idUser") Long idUser);

    @Modifying
    @Query(value = "UPDATE tasks SET " +
            "title = :title," +
            "contents = :contents " +
            "WHERE user_id = :idUser AND id = :idTask", nativeQuery = true)
    void updateByTask(
            @Param("idTask") Long idTask,
            @Param("title") String title,
            @Param("contents") String contents,
            @Param("idUser") Long idUser);
}
