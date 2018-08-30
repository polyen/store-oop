package com.thenewjava.store.product;

public class Laptop extends BaseProduct {

    private float screenSize;
    private int ram;
    private int hddCapacity;
    private String graphicCard;

    public Laptop(String name, float price, String description) {
        super(name, price, description);
    }


    public void turnOn(){

    }

    public void turnOff(){

    }



    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    public void setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }
}

