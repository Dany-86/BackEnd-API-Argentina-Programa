package com.portfolio.da.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AboutMe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(max = 1000, message = "Supera el máximo de 1.000 caracteres")
    private String aboutMe;

    public AboutMe() {
    }

    public AboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
    
    
    
}


