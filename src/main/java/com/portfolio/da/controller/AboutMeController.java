package com.portfolio.da.controller;

import com.portfolio.da.model.AboutMe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.da.service.AboutMeService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://myportfolio-da.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class AboutMeController {
    
    @Autowired
    private AboutMeService aboutMeServ;
    
    @GetMapping ("/aboutMe/get/")
    @ResponseBody
    public ResponseEntity<AboutMe> getAboutMe() {
        return new ResponseEntity(aboutMeServ.getAboutMe(), HttpStatus.OK);
    }
    
    @PostMapping ("/aboutMe/add/")
    public ResponseEntity<?> addAboutMe(@RequestBody AboutMe aboutMe) {
        aboutMeServ.addAboutMe(aboutMe);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @PutMapping ("/aboutMe/update/")
    public ResponseEntity<?> updateAboutMe(@RequestBody AboutMe aboutMe) {
        aboutMeServ.updateAboutMe(aboutMe);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @DeleteMapping ("/aboutMe/delete/")
    public ResponseEntity<?> deleteAboutMe(){
        aboutMeServ.deleteAboutMe();
        return new ResponseEntity("", HttpStatus.OK);
    }
    
}
