package com.portfolio.da.service;

import com.portfolio.da.model.BackImage;

public interface BackImageService {
    
    public BackImage getBackImage();
    public void addBackImage(BackImage backImage);
    public void updateBackImage(BackImage backImage);
    public void deleteBackImage();
    
}
