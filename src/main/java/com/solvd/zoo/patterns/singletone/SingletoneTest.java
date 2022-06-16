package com.solvd.zoo.patterns.singletone;

import com.solvd.zoo.patterns.builder.BuilderPattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SingletoneTest {
    private static final Logger LOGGER = LogManager.getLogger(SingletoneTest.class);

    public static void main(String[] args){
        SingletonePattern.Singletone singletone = SingletonePattern.Singletone.getInstance();
        singletone.setUp();
    }
}

