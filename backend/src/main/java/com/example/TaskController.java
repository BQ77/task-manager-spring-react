package com.example;  

import org.springframework.web.bind.annotation.*;  

@RestController  
@RequestMapping("/tasks")  
public class TaskController {  

    @GetMapping  
    public String getTasks() {  
        return "[Task 1, Task 2]"; // Fake response  
    }  
} 
