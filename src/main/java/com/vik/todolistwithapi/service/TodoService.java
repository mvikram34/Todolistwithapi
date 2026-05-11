package com.vik.todolistwithapi.service;
import com.vik.todolistwithapi.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService
{

    // temporary in-memory storage
    private List<Todo> todos = new ArrayList<>();

    // unique id generator
    private Long idCounter = 1L;

    // CREATE TODO
    public Todo createTodo(Todo todo) {

        // assign unique id
        todo.setId(idCounter++);

        // default completed status
        todo.setCompleted(false);

        // add todo to list
        todos.add(todo);

        // return created todo
        return todo;
    }

    // GET ALL TODOS
    public List<Todo> getAllTodos() {
        return todos;
    }

    // UPDATE TODO
    public Todo updateTodo(Long id, Todo updatedTodo) {

        for (Todo todo : todos) {

            // find matching todo by id
            if (todo.getId().equals(id)) {

                // update fields
                todo.setTitle(updatedTodo.getTitle());
                todo.setCompleted(updatedTodo.getCompleted());

                return todo;
            }
        }

        // if todo not found
        throw new RuntimeException("Todo not found with id: " + id);
    }

    // DELETE TODO
    public void deleteTodo(Long id) {
        // remove matching todo
        todos.removeIf(todo -> todo.getId().equals(id));
    }
}





