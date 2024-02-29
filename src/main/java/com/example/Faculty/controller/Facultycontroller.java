package com.example.Faculty.controller;

import com.example.Faculty.model.Faculty;
import com.example.Faculty.Service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Jahnavi")
public class Facultycontroller {
    @Autowired
    private Facultyservice service;

    @PostMapping("/addfaculties")
    public List<Faculty> addstudents(@RequestBody List<Faculty> faculties){
        return service.createfaculties(faculties);
    }
    @GetMapping("/faculties")
    public List<Faculty> getfaculties(){
        return service.getfaculties();
    }
    @GetMapping("/faculty/{id}")
    public Faculty getfaculty(@PathVariable int id){
        return service.getfaculty(id);

    }
    @DeleteMapping("/faculty/{id}")
    public String deletefaculty(@PathVariable int id){
        return service.deletefaculty(id);
    }
    @PutMapping("/faculty/{id}")
    public Faculty updatestudent(@PathVariable int id,@RequestBody Faculty faculty) {
        return service.updatefaculty(id, faculty);
}

}

