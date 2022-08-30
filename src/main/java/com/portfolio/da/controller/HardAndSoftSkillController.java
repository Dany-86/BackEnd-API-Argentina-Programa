package com.portfolio.da.controller;

import com.portfolio.da.model.HardAndSoftSkill;
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
import com.portfolio.da.service.HardAndSoftSkillService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://myportfolio-da.web.app")
//@CrossOrigin(origins = "http://localhost:4200") 
public class HardAndSoftSkillController {

    @Autowired
    private HardAndSoftSkillService skillServ;
    
    @GetMapping ("/skills/get/")
    @ResponseBody
    public ResponseEntity<List<HardAndSoftSkill>> getSkills() {
        return new ResponseEntity(skillServ.getSkills(), HttpStatus.OK);
    }
    
    @PostMapping ("/skills/add/")
    public ResponseEntity<?> addSkill(@RequestBody HardAndSoftSkill skill) {
        skillServ.addSkill(skill);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @PutMapping ("/skills/update/")
    public ResponseEntity<?> updateSkill(@RequestBody HardAndSoftSkill skill) {
        skillServ.updateSkill(skill);
        return new ResponseEntity("", HttpStatus.OK);
    }
    
    @DeleteMapping ("/skills/delete/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable Long id){
        skillServ.deleteSkill(id);
        return new ResponseEntity("", HttpStatus.OK);
    }

}
