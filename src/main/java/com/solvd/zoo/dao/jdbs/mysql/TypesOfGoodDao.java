package com.solvd.zoo.dao.jdbs.mysql;

import java.util.List;

public class TypesOfGoodDao {
    private long id;
    private String name;
    private List<GoodsDao> goodsDaoList;

    public TypesOfGoodDao() {
    }

    public TypesOfGoodDao(long id, String name, List<GoodsDao> goodsDaoList) {
        this.id = id;
        this.name = name;
        this.goodsDaoList = goodsDaoList;
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

    public List<GoodsDao> getGoodsDaoList() {
        return goodsDaoList;
    }

    public void setGoodsDaoList(List<GoodsDao> goodsDaoList) {
        this.goodsDaoList = goodsDaoList;
    }
}

