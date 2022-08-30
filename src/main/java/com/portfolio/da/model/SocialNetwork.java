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
public class SocialNetwork {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String[] icon;
    private Boolean enabled;
    private String url;

    public SocialNetwork() {
    }

    public SocialNetwork(String name, String[] icon, Boolean enabled, String url) {
        this.name = name;
        this.icon = icon;
        this.enabled = enabled;
        this.url = url;
    }
    
    
        
}