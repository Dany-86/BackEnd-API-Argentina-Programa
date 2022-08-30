package com.portfolio.da.service;

import com.portfolio.da.model.AboutMe;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.da.repository.AboutMeRepository;

@Service
@Transactional
public class AboutMeServiceImpl implements AboutMeService{
    
    @Autowired
    public AboutMeRepository aboutMeRep; 
    
    @Override
    public AboutMe getAboutMe() {
        return aboutMeRep.findAll().get(0); 
    }
    
    @Override
    public void addAboutMe(AboutMe aboutMe) {
        aboutMeRep.save(aboutMe);
    }

    @Override
    public void updateAboutMe(AboutMe aboutMe) {
        this.deleteAboutMe();
        aboutMeRep.save(aboutMe);
    }
    
    @Override
    public void deleteAboutMe() {
        Long id = this.getAboutMe().getId();
        aboutMeRep.deleteById(id);
    }
    
}
