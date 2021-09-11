package com.bridgelabz.inventory.model;

import java.util.ArrayList;

public class GroceryShop {
    protected ArrayList<Grains> grainsList = new ArrayList<> ();


    public GroceryShop(){
        this.grainsList=new ArrayList<Grains> ();
    }
    public GroceryShop ( ArrayList<Grains> grainsList ) {
        this.grainsList = grainsList;
    }

    public void setGrainsList ( ArrayList<Grains> grainsList ) {
        this.grainsList = grainsList;
    }

    public void add (Grains grains ) {
        grainsList.add ( grains );
    }
public ArrayList<Grains> getGrainsList(){return grainsList;}


}
