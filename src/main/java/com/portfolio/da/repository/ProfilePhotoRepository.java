package com.portfolio.da.repository;

import com.portfolio.da.model.ProfilePhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilePhotoRepository extends JpaRepository<ProfilePhoto, Long>{
    
}
