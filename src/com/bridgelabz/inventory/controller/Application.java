package com.bridgelabz.inventory.controller;

import com.bridgelabz.inventory.model.*;
import com.bridgelabz.inventory.view.DrivenInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONException;
import java.util.Scanner;

public class Application {
    static DrivenInterface drivenInterface = new DrivenInterface ();
    static GroceryShop groceryShop = new GroceryShop ();
    static Gson gson=new GsonBuilder().setPrettyPrinting().create();
    static CartTotal carttotal=new CartTotal();
    static double total = 0;

    public static void main ( String[] args ) throws JSONException {
        drivenInterface.Show ( groceryShop );


    }

    public boolean handle ( int option, GroceryShop groceryShop )  {
        Scanner scanner = new Scanner ( System.in );
        switch (option) {
            case 1 -> {
                Rice rice = new Rice ();
                System.out.println("======= RICE =======");
                System.out.print ( "Enter Name: " );
                String name = scanner.nextLine ();
                System.out.print ( "Enter Weight: " );
                double weight = scanner.nextDouble ();
                System.out.print ( "Enter Price / Kg: " );
                double price = scanner.nextDouble ();
                double totalPriceQuantity = weight * price;
                total += totalPriceQuantity;
                rice.setTypename ( name );
                rice.setWeight ( weight );
                rice.setPrice_per_kg ( price );
                rice.setTotalPriceQuantity ( totalPriceQuantity );
                groceryShop.add ( rice );
//                carttotal.setCartTotal(total);
//                groceryShop.add(carttotal);
            }
            case 2 -> {
                Pulses pulses = new Pulses ();
                System.out.println("======= PULSES ========");
                System.out.print ( "Enter Name: " );
                String name = scanner.nextLine ();
                System.out.print ( "Enter Weight: " );
                double weight = scanner.nextDouble ();
                System.out.print ( "Enter Price / Kg: " );
                double price = scanner.nextDouble ();
                double totalPriceQuantity = weight * price;
                total += totalPriceQuantity;
                pulses.setTypename ( name );
                pulses.setWeight ( weight );
                pulses.setPrice_per_kg ( price );
                pulses.setTotalPriceQuantity ( totalPriceQuantity );
                groceryShop.add ( pulses );
//                carttotal.setCartTotal(total);
//                groceryShop.add(carttotal);

            }
            case 3 -> {
                Wheat wheat = new Wheat ();
                System.out.println("======= WHEAT =======");
                System.out.print ( "Enter Name: " );
                String name = scanner.nextLine ();
                System.out.print ( "Enter Weight: " );
                double weight = scanner.nextDouble ();
                System.out.print ( "Enter Price / Kg: " );
                double price = scanner.nextDouble ();
                double totalPriceQuantity = weight * price;
                total += totalPriceQuantity;
                wheat.setTypename ( name );
                wheat.setWeight ( weight );
                wheat.setPrice_per_kg ( price );
                wheat.setTotalPriceQuantity ( totalPriceQuantity );
                groceryShop.add ( wheat );
//                carttotal.setCartTotal(total);
//                groceryShop.add(carttotal);
            }
            case 4 -> {
                drivenInterface.display ( groceryShop.getGrainsList () );
//                groceryShop.add(carttotal);
//                System.out.println("Your Saved Contacts List Below ");
//                var json= gson.toJson(groceryShop);
//                System.out.println(json);
            }
            case 5 -> {
                return false;
            }
            default -> System.out.println ( "\nplz enter correct choice......." );

        }
        carttotal.setCartTotal(total);
        groceryShop.add(carttotal);

        return true;
    }
}
