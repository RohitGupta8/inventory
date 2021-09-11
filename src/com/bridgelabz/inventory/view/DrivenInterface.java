package com.bridgelabz.inventory.view;

import com.bridgelabz.inventory.controller.Application;
import com.bridgelabz.inventory.model.Grains;
import com.bridgelabz.inventory.model.GroceryShop;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.json.JSONArray;
import org.json.JSONException;
import tdanford.json.JSONUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class DrivenInterface {
//    static Gson=new GsonBuilder().setPrettyPrinting().create();
    public void display( ArrayList<Grains> grainsList ){
//        Gson = new GsonBuilder().setPrettyPrinting().create();
//        JsonParser jp = new JsonParser();
//        JsonElement je = jp.parse(String.valueOf(grainsList));
//        String prettyJsonString = gson.toJson(je);
//        gson.toJson(grainsList);
//        Gson gson=new GsonBuilder().setPrettyPrinting().create();
//        String json=gson.toJson(grainsList);
//        System.out.println(json);

        JSONArray jsonArray=new JSONArray();
        jsonArray.put(grainsList);
        System.out.println(grainsList);
//        System.out.println("Your Saved Contacts List Below ");
//        var json= gson.toJson(grainsList);
//        System.out.println(json);
//        try {
//            FileWriter writer=new FileWriter("C:\\Users\\ROHIT GUPTA\\IdeaProjects\\Inventory - Copy\\src\\com\\bridgelabz\\inventory\\view\\inventory.json");
//            writer.write(json.toString());
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    }
    public void Show ( GroceryShop groceryShop ) throws JSONException {
        boolean flag = true;
        while (flag) {
            System.out.println ( "\n\n--------------------------------------\nWELCOME TO Grocery Shop\n-------------------------------------\n" );
            System.out.print ( "1 = Add Rice In Your Cart\n2 = Add Pulses In Your Cart\n3 = Add Wheat In Your Cart\n4 = Check Items In Your Cart\n5 = Exit \nEnter number for Your Choice: " );
            Scanner scanner = new Scanner ( System.in );
            int option = scanner.nextInt ();
            Application application = new Application ();
            flag=application.handle ( option, groceryShop );
        }
    }
}
