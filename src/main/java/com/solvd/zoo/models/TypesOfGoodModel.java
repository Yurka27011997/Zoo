package com.solvd.zoo.models;

import com.solvd.zoo.dao.jdbs.mysql.GoodsDao;

import java.util.List;

public class TypesOfGoodModel {
    private long id;
    private String name;
    private List<GoodsModel> goodsModelList;

    public TypesOfGoodModel() {
    }

    public TypesOfGoodModel(long id, String name, List<GoodsModel> goodsModelList) {
        this.id = id;
        this.name = name;
        this.goodsModelList = goodsModelList;
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

    public void setName(String name)
    {
        this.name = name;
    }

    public List<GoodsModel> getGoodsModelList() {

        return goodsModelList;
    }

    public void setGoodsModelList(List<GoodsModel> goodsModelList) {

        this.goodsModelList = goodsModelList;
    }

    @Override
    public String toString() {
        return "TypesOfGoodModel{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", goodsModelList= " + goodsModelList +
                '}';
    }
}
