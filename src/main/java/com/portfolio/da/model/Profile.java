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
public class Profile {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String profession;
    private String location;
    private String province;
    private String country;
    private String contact;

    public Profile() {
    }

    public Profile(String name, String backImage, String profilePhoto, String profession, String location, String province, String country, String contact) {
        this.name = name;
        this.profession = profession;
        this.location = location;
        this.province = province;
        this.country = country;
        this.contact = contact;
    }
    
    
    
}
