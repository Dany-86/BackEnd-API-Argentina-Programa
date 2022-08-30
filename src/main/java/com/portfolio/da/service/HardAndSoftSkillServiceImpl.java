package com.portfolio.da.service;

import com.portfolio.da.model.HardAndSoftSkill;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.da.repository.HardAndSoftSkillsRepository;
import org.springframework.data.domain.Sort;

@Service
@Transactional
public class HardAndSoftSkillServiceImpl implements HardAndSoftSkillService{
    
    @Autowired
    public HardAndSoftSkillsRepository skillRep; 
    
    @Override
    public List<HardAndSoftSkill> getSkills() {
        return skillRep.findAll(Sort.by("percent").descending()); 
    }
    
    @Override
    public void addSkill(HardAndSoftSkill skill) {
        skillRep.save(skill);
    }

    @Override
    public void updateSkill(HardAndSoftSkill skill) {
        skillRep.save(skill);
    }
    
    @Override
    public void deleteSkill(Long id) {
        skillRep.deleteById(id);
    }
    
}
