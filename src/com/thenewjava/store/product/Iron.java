package com.thenewjava.store.product;

public class Iron extends BaseProduct{
    private int power;
    private String additionalFunctions;
    private String color;

    public Iron(String name, float price, String description) {
        super(name, price, description);
    }

    public void turnOn(){

    }

    public void turnOff(){

    }

    public void changePower(){

    }



    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getAdditionalFunctions() {
        return additionalFunctions;
    }

    public void setAdditionalFunctions(String additionalFunctions) {
        this.additionalFunctions = additionalFunctions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
