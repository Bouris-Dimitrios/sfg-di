package com.springframework.pets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class PetServiceConfiguration {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Bean
    @Profile({"dog", "default"})
    PetService dogPetService(){
        return petServiceFactory().createService("dog");
    }

    @Bean
    @Profile("cat")
    PetService catPetService(){
        return petServiceFactory().createService("cat");
    }
}
