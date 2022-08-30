package com.portfolio.da.service;

import com.portfolio.da.model.AboutMe;
import java.util.List;

public interface AboutMeService {
    
    public AboutMe getAboutMe();
    public void addAboutMe(AboutMe aboutMe);
    public void updateAboutMe(AboutMe aboutMe);
    public void deleteAboutMe();
    
}
