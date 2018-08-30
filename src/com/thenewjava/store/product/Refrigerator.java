package com.thenewjava.store.product;

public class Refrigerator extends BaseProduct {

    private float capacity;
    private boolean freezer;
    private String temperatureRange;

    public Refrigerator(String name) {
        super(name);
    }

    public Refrigerator(String name, float price, String description) {
        super(name, price, description);
    }

    public Refrigerator(String name, String description) {
        super(name, description);
    }


    public void changeTemperature(){

    }

    public void open(){

    }

    public void close(){

    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public boolean isFreezer() {
        return freezer;
    }

    public void setFreezer(boolean freezer) {
        this.freezer = freezer;
    }

    public String getTemperatureRange() {
        return temperatureRange;
    }

    public void setTemperatureRange(String temperatureRange) {
        this.temperatureRange = temperatureRange;
    }
}
