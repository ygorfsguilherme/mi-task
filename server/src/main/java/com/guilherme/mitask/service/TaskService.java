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

    public void save(Task task){
        this.taskRepository.save(task);
    }
    public List<TaskListDto> findAllUser(User user){
        List<Task> taskList = this.taskRepository.findAllByUser(user.getId());
        return taskList.stream().map(TaskListDto::new).toList();
    }
}
