package com.thenewjava.store.product;

public class Phone extends BaseProduct {

    private int flashCapacity;
    private int ram;
    private float screenSize;
    private int numberOfSimCards;

    public Phone(String name) {
        super(name);
    }

    public Phone(String name, float price, String description) {
        super(name, price, description);
    }

    public Phone(String name, String description) {
        super(name, description);
    }


    public void turnOn(){

    }

    public void turnOff(){

    }

    public void call(){

    }

    public void sendSMS(){

    }


    public int getFlashCapacity() {
        return flashCapacity;
    }

    public void setFlashCapacity(int flashCapacity) {
        this.flashCapacity = flashCapacity;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public int getNumberOfSimCards() {
        return numberOfSimCards;
    }

    public void setNumberOfSimCards(int numberOfSimCards) {
        this.numberOfSimCards = numberOfSimCards;
    }
}
