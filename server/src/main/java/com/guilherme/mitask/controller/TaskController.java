package com.guilherme.mitask.controller;

import com.guilherme.mitask.dto.TaskCreateDto;
import com.guilherme.mitask.dto.TaskDto;
import com.guilherme.mitask.dto.TaskListDto;
import com.guilherme.mitask.dto.TaskUpdateDto;
import com.guilherme.mitask.model.Task;
import com.guilherme.mitask.model.User;
import com.guilherme.mitask.service.TaskService;
import com.guilherme.mitask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.security.Principal;
import java.util.List;

@RestController
public class TaskController {
    @Autowired
    UserService userService;
    
    @Autowired
    TaskService taskService;

    @GetMapping("/task/{id}")
    public ResponseEntity<TaskDto> GetTask(
            @PathVariable Long id,
            Principal principal){
        try{
            User user = this.userService.findByName(principal.getName());
            TaskDto task = new TaskDto(this.taskService.findTask(id, user));
            return ResponseEntity.ok().body(task);
        } catch (Exception ex){
            return ResponseEntity.status(403).build();
        }
    }

    @GetMapping("/task/all")
    public ResponseEntity<List<TaskListDto>> GetAllTask(Principal principal){
        try {
            User user = this.userService.findByName(principal.getName());
            return ResponseEntity.ok().body(this.taskService.findAllUser(user));
        }catch (Exception ex){
            return ResponseEntity.status(403).build();
        }
    }

    @GetMapping("/task")
    public ResponseEntity<List<TaskListDto>> GetByTitle(
            @RequestParam("title") String title,
            Principal principal){

        try {
            User user = this.userService.findByName(principal.getName());
            System.out.println(principal.getName());
            return ResponseEntity.ok().body(
                    this.taskService.findByTitle(title, user)
            );

        }catch (Exception ex){
            return ResponseEntity.status(403).build();
        }
    }

    @PostMapping("/task")
    @Transactional
    public ResponseEntity<?> CreateTask(
            @RequestBody TaskCreateDto taskCreateDto,
            Principal principal,
            UriComponentsBuilder uriBuilder){
        try {
            User user = this.userService.findByName(principal.getName());
            Task task = this.taskService.save(new Task(taskCreateDto, user));
            URI uri = uriBuilder.path("task/{id}").buildAndExpand(task.getId()).toUri();
            return ResponseEntity.created(uri).body(taskCreateDto);
        } catch (Exception ex){
            return ResponseEntity.status(403).build();
        }
    }

    @DeleteMapping("/task/{id}")
    @Transactional
    public ResponseEntity<?> DeleteTask(
            @PathVariable Long id,
            Principal principal){
        try {
            User user = this.userService.findByName(principal.getName());
            this.taskService.deleteTask(id, user);
            return ResponseEntity.ok().build();
        } catch (Exception ex){
            return ResponseEntity.status(403).build();
        }
    }

    @PutMapping("/task/{id}")
    @Transactional
    public ResponseEntity<TaskUpdateDto> UpdateTask(
            @PathVariable Long id,
            @RequestBody TaskUpdateDto taskUpdateDto,
            Principal principal,
            UriComponentsBuilder uriBuilder){
        try {
            User user = this.userService.findByName(principal.getName());
            Task task = new Task(taskUpdateDto);
            task.setId(id);
            this.taskService.updateByTask(task, user);
            return ResponseEntity.ok().build();
        } catch (Exception ex){
            return ResponseEntity.status(403).build();
        }
    }
}
