package com.portfolio.da.service;

import com.portfolio.da.model.Project;
import java.util.List;

public interface ProjectService {
    
    public List<Project> getProjects();
    public void addProject(Project project);
    public void updateProject(Project project);
    public void deleteProject(Long id);
    
}
