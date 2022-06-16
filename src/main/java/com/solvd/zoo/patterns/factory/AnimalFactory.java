package com.solvd.zoo.patterns.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnimalFactory {
    private static final Logger LOGGER = LogManager.getLogger(AnimalFactory.class);

        public Animals getNeedAnimal(String inputAnimal) {
            Animals animals = null;
            if (inputAnimal.equals("Elephant")) {
                animals = new ElephantAnimals();
            } else if (inputAnimal.equals("Cow")) {
                animals = new CowAnimals();
            } else if (inputAnimal.equals("Cat")) {
                animals = new CatAnimals();
            }
            return animals;
        }

    interface Animals {
        void getAnimal();
    }
    class ElephantAnimals implements Animals {
        public void getAnimal() {
            LOGGER.info("Use for Elephants");
        }
    }
    class CowAnimals implements Animals {
        public void getAnimal() {
            LOGGER.info("Use for Cows");
        }
    }
    class CatAnimals implements Animals {
        public void getAnimal() {
            LOGGER.info("Use for Elephants");
        }
    }

}
