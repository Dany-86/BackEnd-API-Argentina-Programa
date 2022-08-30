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
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String position;
    private String company;
    private String img;
    private String url;
    private String since;
    private String through;
    
    @Size(max = 1000, message = "Supera el máximo de 1.000 caracteres")
    private String description;

    public Experience() {
    }

    public Experience(String position, String company, String img, String url, String since, String through, String description) {
        this.position = position;
        this.company = company;
        this.img = img;
        this.url = url;
        this.since = since;
        this.through = through;
        this.description = description;
    }
    
    
   
}
