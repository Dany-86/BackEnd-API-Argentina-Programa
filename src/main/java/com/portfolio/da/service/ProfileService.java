package com.portfolio.da.service;

import com.portfolio.da.model.Profile;
import java.util.List;

public interface ProfileService {
    
    public Profile getProfile();
    public void addProfile(Profile profile);
    public void updateProfile(Profile profile);
    public void deleteProfile();
    
}
