package com.portfolio.da.controller;

import com.portfolio.da.model.Education;
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
import com.portfolio.da.service.EducationService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://myportfolio-da.web.app")
//@CrossOrigin(origins = "http://localhost:4200") 
public class EducationController {

     @Autowired
    private EducationService educationServ;
    
    @GetMapping ("/educations/get/")
    @ResponseBody
    public ResponseEntity<List<Education>> getEducations() {
        return new ResponseEntity(educationServ.getEducations(), HttpStatus.OK);
    }
    
    @PostMapping ("/educations/add/")
    public ResponseEntity<?> addEducation(@RequestBody Education education) {
        educationServ.addEducation(education);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @PutMapping ("/educations/update/")
    public ResponseEntity<?> updateEducation(@RequestBody Education education) {
        educationServ.updateEducation(education);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @DeleteMapping ("/educations/delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable Long id){
        educationServ.deleteEducation(id);
        return new ResponseEntity("", HttpStatus.OK);
    }
        
}
