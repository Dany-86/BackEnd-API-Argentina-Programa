package com.portfolio.da.service;

import com.portfolio.da.model.ProfilePhoto;

public interface ProfilePhotoService {
    public ProfilePhoto getProfilePhoto();
    public void addProfilePhoto(ProfilePhoto profilePhoto);
    public void updateProfilePhoto(ProfilePhoto profilePhoto);
    public void deleteProfilePhoto();
}
