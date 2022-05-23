package com.solvd.zoo.parser.json;

public class MainJson {
    public static void main(String[] args) {
        JsonWriteToFile jsonWriteToFile = new JsonWriteToFile();
        jsonWriteToFile.jsonWrite();

        JsonReadFromFile jsonReadFromFile = new JsonReadFromFile();
        jsonReadFromFile.jsonRead();
    }
}
