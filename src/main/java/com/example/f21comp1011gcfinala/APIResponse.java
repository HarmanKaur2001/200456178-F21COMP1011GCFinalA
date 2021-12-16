package com.example.f21comp1011gcfinala;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collections;

public class APIResponse {

    @SerializedName("Dealership")
    private String dealership;

    @SerializedName("Inventory")
    private ArrayList<Car> inventory;

    public String getDealership() {
        return dealership;
    }

    public ArrayList<Car> getSearchSorted()
    {
        //Collections.sort(inventory);
        return inventory;
    }

    public void setDealership(String dealership) {
        this.dealership = dealership;
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Car> inventory) {
        this.inventory = inventory;
    }
}
