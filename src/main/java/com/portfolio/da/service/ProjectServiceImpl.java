package com.portfolio.da.service;

import com.portfolio.da.model.Project;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.da.repository.ProjectRepository;
import org.springframework.data.domain.Sort;

@Service
@Transactional 
public class ProjectServiceImpl implements ProjectService{
    
    @Autowired
    public ProjectRepository projectRep; 
    
    @Override
    public List<Project> getProjects() {
        return projectRep.findAll(Sort.by("through").descending()); 
    }
    
    @Override
    public void addProject(Project project) {
        projectRep.save(project);
    }

    @Override
    public void updateProject(Project project) {
        projectRep.save(project);
    }
    
    @Override
    public void deleteProject(Long id) {
        projectRep.deleteById(id);
    }
    
}
