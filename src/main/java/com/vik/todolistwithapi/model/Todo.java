package com.vik.todolistwithapi.model;

public class Todo {
    // id- for Identifying each task from todolist
    // title - what is inside the todolist a perticular todolist
    // completed - is the tast completed or not (check box)
    private Long id;
    private String title;
    private Boolean completed;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public Boolean getCompleted(){
        return completed;
    }
    public void setCompleted(Boolean completed){
        this.completed=completed;
    }

}
