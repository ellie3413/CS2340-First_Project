package com.example.cs2340_first_project;

import java.util.ArrayList;
import java.util.Date;

public class Todo
{
    public static ArrayList<Todo> todoArrayList = new ArrayList<>();
    public static String TODO_EDIT_EXTRA =  "todoEdit";

    private int id;
    private String title;
    private String description;
    private String course;
    private String location;
    private String category;
    private String dateTime; // ISO8601 format for date and time
    private Date deleted;




    public Todo(int id, String title, String description, String course, String location, String category, String dateTime, Date deleted)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.course = course;
        this.location = location;
        this.category = category;
        this.dateTime = dateTime;
        this.deleted = deleted;
    }

    public Todo(int id, String title, String description, String course, String location, String category, String dateTime)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.course = course;
        this.location = location;
        this.category = category;
        this.dateTime = dateTime;
        deleted = null;
    }



    public static Todo getTodoForID(int passedTodoID)
    {
        for (Todo todo : todoArrayList)
        {
            if(todo.getId() == passedTodoID)
                return todo;
        }

        return null;
    }

    public static ArrayList<Todo> nonDeletedTodos()
    {
        ArrayList<Todo> nonDeleted = new ArrayList<>();
        for(Todo todo : todoArrayList)
        {
            if(todo.getDeleted() == null)
                nonDeleted.add(todo);
        }

        return nonDeleted;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getCourse()
    {
        return course;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }

    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    public String getCategory()
    {
        return category;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public String getDateTime()
    {
        return category;
    }
    public void setDateTime(String dateTime)
    {
        this.dateTime = dateTime;
    }
    public Date getDeleted()
    {
        return deleted;
    }

    public void setDeleted(Date deleted)
    {
        this.deleted = deleted;
    }

}
