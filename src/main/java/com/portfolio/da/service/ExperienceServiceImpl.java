package com.portfolio.da.service;

import com.portfolio.da.model.Experience;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.portfolio.da.repository.ExperienceRepository;

@Service
@Transactional 
public class ExperienceServiceImpl implements ExperienceService{
    
    @Autowired
    public ExperienceRepository experienceRep; 
    
    @Override
    public List<Experience> getExperiences() {
        return experienceRep.findAll(Sort.by("through").descending());
    }
    
    @Override
    public void addExperience(Experience experience) {
        experienceRep.save(experience);
    }
    
    @Override
    public void updateExperience(Experience experience) {
        experienceRep.save(experience);
    }
    
    @Override
    public void deleteExperience(Long id) {
        experienceRep.deleteById(id);
    }
    
}
