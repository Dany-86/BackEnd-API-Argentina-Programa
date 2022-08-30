package com.portfolio.da.service;

import com.portfolio.da.model.BackImage;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.da.repository.BackImageRepository;

@Service
@Transactional
public class BackImageServiceImpl implements BackImageService{

    @Autowired
    public BackImageRepository  backImageRep;
    
    @Override
    public BackImage getBackImage() {
        return backImageRep.findAll().get(0);
    }

    @Override
    public void addBackImage(BackImage backImage) {
        backImageRep.save(backImage);
    }

    @Override
    public void updateBackImage(BackImage backImage) {
        this.deleteBackImage();
        backImageRep.save(backImage);
    }

    @Override
    public void deleteBackImage() {
       Long id = this.getBackImage().getId();
        backImageRep.deleteById(id);
    }
    
}
