package com.votre.rest.webservices.restfulwebservices.limit.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("limits-service")
public class Configuration {

    private int minimum;
    private int maximum;

}
