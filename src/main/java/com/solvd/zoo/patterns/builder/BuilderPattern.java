package com.solvd.zoo.patterns.builder;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BuilderPattern {
    private static final Logger LOGGER = LogManager.getLogger(BuilderPattern.class);


    public static void main(String[] args) {
        Animal frog = new Animal.BuilderAnimal("frog").setName("Rapunzel").setAge(25).build();
        LOGGER.info(frog);
    }
}

