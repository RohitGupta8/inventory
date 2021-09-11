package com.bridgelabz.inventory.model;

public class CartTotal extends Grains {
    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    @Override
    public String toString() {
        return "CartTotal = Rs."+ cartTotal
                ;
    }

    private double cartTotal;
}
