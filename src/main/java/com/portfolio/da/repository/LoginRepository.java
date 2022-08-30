package com.portfolio.da.repository;

import com.portfolio.da.model.UserLogin;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<UserLogin, Integer>{
    
    Optional<UserLogin> findByMail(String mail);
    
}
