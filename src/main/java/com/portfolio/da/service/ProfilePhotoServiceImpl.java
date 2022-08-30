package com.portfolio.da.service;

import com.portfolio.da.model.ProfilePhoto;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.da.repository.ProfilePhotoRepository;

@Service
@Transactional
public class ProfilePhotoServiceImpl implements ProfilePhotoService{

    @Autowired
    public ProfilePhotoRepository  profilePhotoRep;
    
    @Override
    public ProfilePhoto getProfilePhoto() {
        return profilePhotoRep.findAll().get(0);
    }

    @Override
    public void addProfilePhoto(ProfilePhoto profilePhoto) {
        profilePhotoRep.save(profilePhoto);
    }

    @Override
    public void updateProfilePhoto(ProfilePhoto profilePhoto) {
        this.deleteProfilePhoto();
        profilePhotoRep.save(profilePhoto);
    }

    @Override
    public void deleteProfilePhoto() {
        Long id = this.getProfilePhoto().getId();
        profilePhotoRep.deleteById(id);
    }
    
}
