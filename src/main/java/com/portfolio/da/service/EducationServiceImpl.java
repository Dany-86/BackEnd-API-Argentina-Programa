package com.portfolio.da.service;

import com.portfolio.da.model.Education;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.da.repository.EducationRepository;
import org.springframework.data.domain.Sort;

@Service
@Transactional 
public class EducationServiceImpl implements EducationService{
    
    @Autowired
    public EducationRepository educationRep; 
    
    @Override
    public List<Education> getEducations() {
        return educationRep.findAll(Sort.by("through").descending()); 
    }
    
    @Override
    public void addEducation(Education education) {
        educationRep.save(education);
    }

    @Override
    public void updateEducation(Education education) {
        educationRep.save(education);
    }
    
    @Override
    public void deleteEducation(Long id) {
        educationRep.deleteById(id);
    }
    
}
    
