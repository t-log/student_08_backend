package com.example.student_08_backend.controller;

import com.example.student_08_backend.dao.StudentDao;
import com.example.student_08_backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String homePage(){return "Welcome to student home page";}

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(path ="/addstudent",consumes = "application/json",produces = "application/json")
    public String addStudent(@RequestBody Student s){
        dao.save(s);
        return "{\"status\":\"success\"}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchstudent",consumes = "application/json",produces = "application/json")
    public List<Student> searchPage(@RequestBody Student s){
        return (List<Student>) dao.searchStudent(s.getName());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deletestudent",consumes = "application/json",produces = "application/json")
    public String deletePage(@RequestBody Student p){
        dao.deleteStudent(p.getId());
        return "{\"status\":\"success\"}";
    }
}
