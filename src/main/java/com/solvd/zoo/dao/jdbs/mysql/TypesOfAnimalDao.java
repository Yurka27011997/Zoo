package com.solvd.zoo.dao.jdbs.mysql;

import java.util.List;

public class TypesOfAnimalDao {
    private long id;
    private String name;
    private List<AnimalsDao> animalsDaoList;

    public TypesOfAnimalDao() {
    }

    public TypesOfAnimalDao(long id, String name, List<AnimalsDao> animalsDaoList) {
        this.id = id;
        this.name = name;
        this.animalsDaoList = animalsDaoList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AnimalsDao> getAnimalsDaoList() {
        return animalsDaoList;
    }

    public void setAnimalsDaoList(List<AnimalsDao> animalsDaoList) {
        this.animalsDaoList = animalsDaoList;
    }
}
