package com.portfolio.da.controller;

import com.portfolio.da.model.Experience;
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
import com.portfolio.da.service.ExperienceService;

@RestController
@RequestMapping("/api") 
@CrossOrigin(origins = "https://myportfolio-da.web.app")
//@CrossOrigin(origins = "http://localhost:4200") 
public class ExperienceController {
 
    @Autowired
    private ExperienceService experienceServ;
    
    @GetMapping ("/experiences/get/")
    @ResponseBody
    public ResponseEntity<List<Experience>> getExperiences() {
        return new ResponseEntity(experienceServ.getExperiences(), HttpStatus.OK);
    }
    
    @PostMapping ("/experiences/add/")
    public ResponseEntity<?> addExperience(@RequestBody Experience experience) {
        experienceServ.addExperience(experience);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @PutMapping ("/experiences/update/")
    public ResponseEntity<?> updateExperience(@RequestBody Experience experience) {
        experienceServ.updateExperience(experience);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @DeleteMapping ("/experiences/delete/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable Long id){
        experienceServ.deleteExperience(id);
        return new ResponseEntity("", HttpStatus.OK);
    }

}
