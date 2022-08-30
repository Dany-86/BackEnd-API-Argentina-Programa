package com.portfolio.da.controller;

import com.portfolio.da.model.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.da.service.ProjectService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://myportfolio-da.web.app")
//@CrossOrigin(origins = "http://localhost:4200") 
public class ProjectController {
  
    @Autowired
    private ProjectService projectServ;
    
    @GetMapping ("/projects/get/")
    @ResponseBody
    public ResponseEntity<List<Project>> getProjects() {
        return new ResponseEntity(projectServ.getProjects(), HttpStatus.OK);
    }
    
    @PostMapping ("/projects/add/")
    public ResponseEntity<?> addProject(@RequestBody Project project) {
        projectServ.addProject(project);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @PutMapping ("/projects/update/")
    public ResponseEntity<?> updateProject(@RequestBody Project project) {
        projectServ.updateProject(project);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @DeleteMapping ("/projects/delete/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable Long id){
        projectServ.deleteProject(id);
        return new ResponseEntity("", HttpStatus.OK);
    }

}
