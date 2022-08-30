package com.portfolio.da.repository;

import com.portfolio.da.model.HardAndSoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardAndSoftSkillsRepository extends JpaRepository<HardAndSoftSkill, Long>{
    
}
