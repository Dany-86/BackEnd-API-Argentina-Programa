package com.portfolio.da.service;

import com.portfolio.da.model.SocialNetwork;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.da.repository.SocialNetworkRepository;

@Service
@Transactional 
public class SocialNetworkServiceImpl implements SocialNetworkService{
    
    @Autowired
    public SocialNetworkRepository socialNetworkRep; 
    
    @Override
    public List<SocialNetwork> getSocialNetworks() {
        return socialNetworkRep.findAll(); 
    }
    
    @Override
    public void addSocialNetwork(SocialNetwork socialNetwork) {
        socialNetworkRep.save(socialNetwork);
    }

    @Override
    public void updateSocialNetwork(SocialNetwork socialNetwork, Long id) {
        this.deleteSocialNetwork(id);
        socialNetworkRep.save(socialNetwork);
    }
    
    @Override
    public void updateSocialNetworkList(SocialNetwork[] socialNetworkList) {
        socialNetworkRep.deleteAll();
        for(SocialNetwork socialNetwork: socialNetworkList)
            this.addSocialNetwork(socialNetwork);
    }
    
    @Override
    public void deleteSocialNetwork(Long id) {
        socialNetworkRep.deleteById(id);
    }

    
    
}
