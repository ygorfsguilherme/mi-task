package com.guilherme.mitask.service;

import com.guilherme.mitask.dto.TaskListDto;
import com.guilherme.mitask.model.Task;
import com.guilherme.mitask.model.User;
import com.guilherme.mitask.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public Task save(Task task){
        return this.taskRepository.save(task);
    }
    public List<TaskListDto> findAllUser(User user){
        List<Task> taskList = this.taskRepository.findAllByUser(user.getId());
        return taskList.stream().map(TaskListDto::new).toList();
    }

    public Task findTask(Long id, User user) {
        return this.taskRepository.findTask(id, user.getId());
    }

    public void deleteTask(Long id, User user){
        this.taskRepository.deleteByTask(id, user.getId());
    }

    public void updateByTask(Task task, User user) {
        this.taskRepository.updateByTask(
                task.getId(),
                task.getTitle(),
                task.getContents(),
                user.getId()
        );
    }
}
