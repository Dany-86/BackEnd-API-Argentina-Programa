package com.portfolio.da.service;

import com.portfolio.da.model.Profile;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.da.repository.ProfileRepository;

@Service
@Transactional 
public class ProfileServiceImpl implements ProfileService{
    
    @Autowired
    public ProfileRepository profileRep; 
    
    @Override
    public Profile getProfile() {
        return profileRep.findAll().get(0); 
    }
    
    @Override
    public void addProfile(Profile profile) {
        profileRep.save(profile);
    }

    @Override
    public void updateProfile(Profile profile) {
        this.deleteProfile();
        profileRep.save(profile);
    }
    
    @Override
    public void deleteProfile() {
        Long id = this.getProfile().getId();
        profileRep.deleteById(id);
    }
    
}
