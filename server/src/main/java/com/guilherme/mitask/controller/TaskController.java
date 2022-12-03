package com.guilherme.mitask.controller;

import com.guilherme.mitask.dto.TaskCreateDto;
import com.guilherme.mitask.dto.TaskListDto;
import com.guilherme.mitask.model.Task;
import com.guilherme.mitask.model.User;
import com.guilherme.mitask.service.TaskService;
import com.guilherme.mitask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    UserService userService;
    @Autowired
    TaskService taskService;
    @PostMapping("/task")
    public void CreateTask(@RequestBody TaskCreateDto taskCreateDto){
        User user = this.userService.findUser(taskCreateDto.getUser());
        String title = taskCreateDto.getTitle();
        String contents = taskCreateDto.getContents();

        this.taskService.save(new Task(title, contents, user));
    }

    @GetMapping("/task")
    public List<TaskListDto> GetAllTask(@RequestBody TaskCreateDto taskCreateDto){
        User user = this.userService.findUser(taskCreateDto.getUser());
        return this.taskService.findAllUser(user);
    }
}
