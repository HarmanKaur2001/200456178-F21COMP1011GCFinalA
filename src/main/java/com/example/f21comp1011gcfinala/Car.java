package com.example.f21comp1011gcfinala;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Car {

    private String id;

    private String year;

    private String make;

    private String price;

    private String model;

    private Array type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Array getType() {
        return type;
    }

    public void setType(Array type) {
        this.type = type;
    }


    public String toString()
    {
        return String.format("%s-%s",year, make, price, model, type);
    }

}
