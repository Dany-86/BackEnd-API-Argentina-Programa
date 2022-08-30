package com.portfolio.da.repository;

import com.portfolio.da.model.BackImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackImageRepository extends JpaRepository<BackImage, Long> {
    
}
