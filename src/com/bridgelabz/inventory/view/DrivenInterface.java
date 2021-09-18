package com.bridgelabz.inventory.view;

import com.bridgelabz.inventory.controller.Application;
import com.bridgelabz.inventory.model.Grains;
import com.bridgelabz.inventory.model.GroceryShop;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Scanner;

public class DrivenInterface {

    public void display( ArrayList<Grains> grainsList ){
        JSONArray jsonArray=new JSONArray();
        jsonArray.put(grainsList);
        System.out.println(grainsList);
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
