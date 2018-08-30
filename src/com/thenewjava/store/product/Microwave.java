package com.thenewjava.store.product;

public class Microwave extends BaseProduct{

    private float capacity;
    private int power;
    private String additionalFunctions;
    private String color;

    public Microwave(String name) {
        super(name);
    }

    public Microwave(String name, float price, String description) {
        super(name, price, description);
    }

    public Microwave(String name, String description) {
        super(name, description);
    }


    public void turnOn(){

    }

    public void turnOff(){

    }

    public void changePower(){

    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
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
