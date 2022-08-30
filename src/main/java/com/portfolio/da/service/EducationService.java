package com.portfolio.da.service;

import com.portfolio.da.model.Education;
import java.util.List;

public interface EducationService {
    
    public List<Education> getEducations();
    public void addEducation(Education education);
    public void updateEducation(Education education);
    public void deleteEducation(Long id);
    
}
