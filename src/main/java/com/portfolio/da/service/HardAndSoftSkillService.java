package com.portfolio.da.service;

import com.portfolio.da.model.HardAndSoftSkill;
import java.util.List;

public interface HardAndSoftSkillService {
    
    public List<HardAndSoftSkill> getSkills();
    public void addSkill(HardAndSoftSkill Skill);
    public void updateSkill(HardAndSoftSkill Skill);
    public void deleteSkill(Long id);
    
}
