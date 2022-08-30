package com.portfolio.da.service;

import com.portfolio.da.model.SocialNetwork;
import java.util.List;

public interface SocialNetworkService {
    
    public List<SocialNetwork> getSocialNetworks();
    public void addSocialNetwork(SocialNetwork socialNetwork);
    public void updateSocialNetwork(SocialNetwork socialNetwork, Long id);
    public void updateSocialNetworkList(SocialNetwork[] socialNetworkList);
    public void deleteSocialNetwork(Long id);
    
}
