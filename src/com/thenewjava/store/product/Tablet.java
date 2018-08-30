package com.thenewjava.store.product;

public class Tablet extends BaseProduct{

    private float size;
    private int ram;
    private int flashCapacity;
    private String screenResolution;

    public Tablet(String name) {
        super(name);
    }

    public Tablet(String name, float price, String description) {
        super(name, price, description);
    }

    public Tablet(String name, String description) {
        super(name, description);
    }


    public void turnOn(){

    }

    public void turnOff(){

    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getFlashCapacity() {
        return flashCapacity;
    }

    public void setFlashCapacity(int flashCapacity) {
        this.flashCapacity = flashCapacity;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }
}
