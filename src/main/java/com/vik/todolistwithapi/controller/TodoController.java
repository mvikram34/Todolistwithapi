package com.vik.todolistwithapi.controller;
import com.vik.todolistwithapi.model.Todo;
import com.vik.todolistwithapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService service;

    // CREATE
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return service.createTodo(todo);
    }

    // READ
    @GetMapping
    public List<Todo> getAllTodos() {
        return service.getAllTodos();
    }

    // UPDATE
    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
        return service.updateTodo(id, todo);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable Long id) {
        service.deleteTodo(id);
        return "Todo deleted successfully";
    }
}

