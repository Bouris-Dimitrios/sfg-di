package com.springframework.pets;

public class PetServiceFactory {

  public  PetService createService(String type){
        if ("dog".equals(type)){
            return new DogPetService();
        }else{
            return new CatPetService();
        }
    }
}
