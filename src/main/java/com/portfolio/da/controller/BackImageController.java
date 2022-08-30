package com.portfolio.da.controller;

import com.portfolio.da.model.BackImage;
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
import com.portfolio.da.service.BackImageService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://myportfolio-da.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class BackImageController {
    
    @Autowired
    private BackImageService backImageServ;
    
    @GetMapping ("/backImage/get/")
    @ResponseBody
    public ResponseEntity<BackImage> getBackImage() {
        return new ResponseEntity(backImageServ.getBackImage(), HttpStatus.OK);
    }
    
    @PostMapping ("/backImage/add/")
    public ResponseEntity<?> addBackImage(@RequestBody BackImage backImage) {
        backImageServ.addBackImage(backImage);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @PutMapping ("/backImage/update/")
    public ResponseEntity<?> updateBackImage(@RequestBody BackImage backImage) {
        backImageServ.updateBackImage(backImage);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @DeleteMapping ("/backImage/delete/")
    public ResponseEntity<?> deleteBackImage(){
        backImageServ.deleteBackImage();
        return new ResponseEntity("", HttpStatus.OK);
    }
    
}
