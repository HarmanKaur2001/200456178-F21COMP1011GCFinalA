package com.example.f21comp1011gcfinala;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;

public class APIUtility {

    public static APIResponse getCarInfo()
    {
        //create a GSON object
        Gson gson = new Gson();
        APIResponse response = null;

        try(
                FileReader fileReader = new FileReader("carData.json");
                JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
            response = gson.fromJson(jsonReader, APIResponse.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return response;
    }
}
