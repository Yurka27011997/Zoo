package com.solvd.zoo.patterns.singletone;

import com.solvd.zoo.patterns.builder.BuilderPattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SingletonePattern {
    private static final Logger LOGGER = LogManager.getLogger(SingletonePattern.class);
    static class Singletone {
        private static Singletone instance = null;

        private Singletone() {
        }

        public static Singletone getInstance() {
            if (instance == null) {
                instance = new Singletone();
            }
            return instance;
        }

        public void setUp() {
            LOGGER.info("setUp");
        }
    }
}

