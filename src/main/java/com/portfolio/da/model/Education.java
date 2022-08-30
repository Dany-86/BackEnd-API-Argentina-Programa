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
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String career;
    private String institution;
    private String img;
    private String url;
    private String since;
    private String through;
    private Boolean complete;
    
    @Size(max = 1000, message = "Supera el máximo de 1.000 caracteres")
    private String description;

    public Education() {
    }

    public Education(String career, String institution, String img, String url, String since, String through, Boolean complete, String description) {
        this.career = career;
        this.institution = institution;
        this.img = img;
        this.url = url;
        this.since = since;
        this.through = through;
        this.complete = complete;
        this.description = description;
    }
    
    
    
}

