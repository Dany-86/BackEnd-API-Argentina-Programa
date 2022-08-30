package com.portfolio.da.service;

import com.portfolio.da.model.Experience;
import java.util.List;

public interface ExperienceService {
    
    public List<Experience> getExperiences();
    public void addExperience(Experience experience);
    public void updateExperience(Experience experience);
    public void deleteExperience(Long id);
    
}
