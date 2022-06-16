package com.solvd.zoo.patterns.factory;

import com.solvd.zoo.patterns.builder.BuilderPattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryPattern {
    private static final Logger LOGGER = LogManager.getLogger(FactoryPattern.class);

    public static void main(String[] args){
        String input = "Cow";
        AnimalFactory animalFactory = new AnimalFactory();
        AnimalFactory.Animals animals = animalFactory.getNeedAnimal(input);
        animals.getAnimal();
    }
}
