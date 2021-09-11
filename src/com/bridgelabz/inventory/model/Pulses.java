package com.bridgelabz.inventory.model;

public class Pulses extends Grains {
    private  String typename;
    private double weight;
    private double price_per_kg;
    private double totalPriceQuantity;

    @Override
    public String toString() {
        return "Pulses{" +
                "typename ='" + typename + '\'' +
                ", weight =" + weight +"kg"+
                ", price_per_kg = Rs." + price_per_kg +"/kg"+
                ", totalPriceQuantity = Rs." + totalPriceQuantity +
                '}';
    }

    public String getTypename () {
        return typename;
    }


    public void setTypename ( String typename ) {
        this.typename = typename;
    }

    public double getPrice_per_kg () {
        return price_per_kg;
    }

    public void setPrice_per_kg ( double price_per_kg ) {
        this.price_per_kg = price_per_kg;
    }

    public double getWeight () {
        return weight;
    }

    public void setWeight ( double weight ) {
        this.weight = weight;
    }

    public double getTotalPriceQuantity () {
        return totalPriceQuantity;
    }

    public void setTotalPriceQuantity ( double totalPriceQuantity ) {
        this.totalPriceQuantity = totalPriceQuantity;
    }
}
