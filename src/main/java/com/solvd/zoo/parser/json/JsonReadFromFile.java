package com.solvd.zoo.parser.json;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class JsonReadFromFile {
    private static final Logger LOGGER = LogManager.getLogger(JsonWriteToFile.class);
    public void jsonRead() {
        ObjectMapper mapper = new ObjectMapper();
        try{
            LOGGER.info("Reading JSON from a file: ");

            BufferedReader br = new BufferedReader (new FileReader("src/main/resources/JSON/testForJson.json"));

            //convert the json string back to object
            Animal animalObj = mapper.readValue(br, Animal.class);

            LOGGER.info("Id of Animal: " + animalObj.getId());

            LOGGER.info("NickName Of Animal: " + animalObj.getNickname());

            LOGGER.info("Date of Birth: " + animalObj.getDateOfBirth());

            LOGGER.info("You can see in our ZOO: ");

            List<String> listOfStates = animalObj.getListOfAnimals();
            for (int i = 0; i < listOfStates.size(); i++) {
                LOGGER.info(listOfStates.get(i));
            }
            LOGGER.info("Data read from JSonFile successfully");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
