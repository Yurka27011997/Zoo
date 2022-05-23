package com.solvd.zoo.parser.json;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonWriteToFile {
    private static final Logger LOGGER = LogManager.getLogger(JsonWriteToFile.class);
    public void jsonWrite()
    {
        Animal animalObj = new Animal();
        animalObj.setId(1);
        animalObj.setNickname("Larik");
        animalObj.setDateOfBirth("03.08.2015");
        List<String> listOfAnimals = new ArrayList<>();

        listOfAnimals.add("Tiger");
        listOfAnimals.add("Elephant");
        listOfAnimals.add("Mouse");

        animalObj.setListOfAnimals(listOfAnimals);
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/JSON/testForJson.json"), animalObj);
            LOGGER.info("Data was write to JSonFile successfully");


        } catch (JsonGenerationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
