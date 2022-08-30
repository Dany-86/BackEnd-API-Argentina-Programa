package com.portfolio.da.controller;

import com.portfolio.da.model.Profile;
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
import com.portfolio.da.service.ProfileService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://myportfolio-da.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class ProfileController {

    @Autowired
    private ProfileService profileServ;
    
    @GetMapping ("/profile/get/")
    @ResponseBody
    public ResponseEntity<Profile> getProfile() {
        return new ResponseEntity(profileServ.getProfile(), HttpStatus.OK);
    }
    
    @PostMapping ("/profile/add/")
    public ResponseEntity<?> addProfile(@RequestBody Profile profile) {
        profileServ.addProfile(profile);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @PutMapping ("/profile/update/")
    public ResponseEntity<?> updateProfile(@RequestBody Profile profile) {
        profileServ.updateProfile(profile);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @DeleteMapping ("/profile/delete/")
    public ResponseEntity<?> deleteProfile(){
        profileServ.deleteProfile();
        return new ResponseEntity("", HttpStatus.OK);
    }

}
