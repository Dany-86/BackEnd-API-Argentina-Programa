package com.portfolio.da.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class HardAndSoftSkill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skill;
    private int percent;
    private String img;
    private String url;
    private String colorCircle;

    public HardAndSoftSkill() {
    }

    public HardAndSoftSkill(String skill, int percent, String img, String url, String colorCircle) {
        this.skill = skill;
        this.percent = percent;
        this.img = img;
        this.url = url;
        this.colorCircle = colorCircle;
    }
    
    
    
}

