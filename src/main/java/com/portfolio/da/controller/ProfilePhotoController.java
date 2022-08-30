package com.portfolio.da.controller;

import com.portfolio.da.model.ProfilePhoto;
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
import com.portfolio.da.service.ProfilePhotoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://myportfolio-da.web.app")
//@CrossOrigin(origins = "http://localhost:4200") 
public class ProfilePhotoController {
    
    @Autowired
    private ProfilePhotoService profilePhotoServ;
    
    @GetMapping ("/profilePhoto/get/")
    @ResponseBody
    public ResponseEntity<ProfilePhoto> getProfilePhoto() {
        return new ResponseEntity(profilePhotoServ.getProfilePhoto(), HttpStatus.OK);
    }
    
    @PostMapping ("/profilePhoto/add/")
    public ResponseEntity<?> addProfilePhoto(@RequestBody ProfilePhoto profilePhoto) {
        profilePhotoServ.addProfilePhoto(profilePhoto);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @PutMapping ("/profilePhoto/update/")
    public ResponseEntity<?> updateProfilePhoto(@RequestBody ProfilePhoto profilePhoto) {
        profilePhotoServ.updateProfilePhoto(profilePhoto);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @DeleteMapping ("/profilePhoto/delete/")
    public ResponseEntity<?> deleteProfilePhoto(){
        profilePhotoServ.deleteProfilePhoto();
        return new ResponseEntity("", HttpStatus.OK);
    }
    
}
