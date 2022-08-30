package com.portfolio.da.controller;

import com.portfolio.da.model.SocialNetwork;
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
import com.portfolio.da.service.SocialNetworkService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://myportfolio-da.web.app")
//@CrossOrigin(origins = "http://localhost:4200") 
public class SocialNetworkController {
      
    @Autowired
    private SocialNetworkService socialNetworkServ;
    
    @GetMapping ("/socialNetworks/get/")
    @ResponseBody
    public ResponseEntity<List<SocialNetwork>> getSocialNetworks() {
        return new ResponseEntity(socialNetworkServ.getSocialNetworks(), HttpStatus.OK);
    }
    
    @PostMapping ("/socialNetworks/add/")
    public ResponseEntity<?> addSocialNetwork(@RequestBody SocialNetwork socialNetwork) {
        socialNetworkServ.addSocialNetwork(socialNetwork);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @PutMapping ("/socialNetworks/update/{id}")
    public ResponseEntity<?> updateSocialNetwork(@RequestBody SocialNetwork socialNetwork,
                                    @PathVariable Long id) {
        socialNetworkServ.updateSocialNetwork(socialNetwork, id);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @PutMapping ("/socialNetworks/update/list")
    public ResponseEntity<?> updateSocialNetwork(@RequestBody SocialNetwork[] socialNetwork) {
        socialNetworkServ.updateSocialNetworkList(socialNetwork);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @DeleteMapping ("/socialNetworks/delete/{id}")
    public ResponseEntity<?> deleteSocialNetwork(@PathVariable Long id){
        socialNetworkServ.deleteSocialNetwork(id);
        return new ResponseEntity("", HttpStatus.OK);
    }

}
