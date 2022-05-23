package com.solvd.zoo.parser.json;

import java.util.List;

public class Animal {
    private long id;
    private String nickname;
    private String dateOfBirth;
    private List<String> listOfAnimals;

    public Animal() {
    }

    public Animal(long id, String nickname, String dateOfBirth, List<String> listOfAnimals) {
        this.id = id;
        this.nickname = nickname;
        this.dateOfBirth = dateOfBirth;
        this.listOfAnimals = listOfAnimals;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String> getListOfAnimals() {
        return listOfAnimals;
    }

    public void setListOfAnimals(List<String> listOfAnimals) {
        this.listOfAnimals = listOfAnimals;
    }
}
