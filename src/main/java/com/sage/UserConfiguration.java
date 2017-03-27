package com.sage;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@EnableConfigurationProperties
@ConfigurationProperties ("nodesecrets")
public class UserConfiguration {

    // Magic name matches yaml
    private List<User> productionusers = new ArrayList<>();

    public List<User> getProductionusers() {
        return this.productionusers;
    }
}