package com.solvd.zoo.patterns.abstractFactoryPattern;

import com.solvd.zoo.patterns.builder.BuilderPattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AbstractFactoryTest {
    private static final Logger LOGGER = LogManager.getLogger(AbstractFactoryTest.class);
    public static void main(String[] args) {
        String country = "UA";
        AbstractFactoryPattern.InteAbsFactory ifactory = null;
        if(country.equals("UA")) {
            ifactory = new AbstractFactoryPattern.UaAnimalPriceAbsFactory();
        } else if(country.equals("PL")) {
            ifactory = new AbstractFactoryPattern.PLAnimalPriceAbsFactory();
        }

        AbstractFactoryPattern.Lion lion = ifactory.getLion();
        LOGGER.info(lion.getLionPrice());
    }
}

