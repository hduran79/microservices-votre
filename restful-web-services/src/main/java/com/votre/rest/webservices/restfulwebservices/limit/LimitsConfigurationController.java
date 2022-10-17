package com.votre.rest.webservices.restfulwebservices.limit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.votre.rest.webservices.restfulwebservices.limit.dto.Configuration;
import com.votre.rest.webservices.restfulwebservices.limit.dto.LimitConfigurationDTO;

@RestController
public class LimitsConfigurationController {

    
    @Autowired
    private Configuration configuration;
    
    
    @GetMapping("/limits")
    public LimitConfigurationDTO retrieveLimitsConfigurations() {
        return new LimitConfigurationDTO(configuration.getMaximum(), configuration.getMinimum());
    }
}
