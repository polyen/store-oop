package com.thenewjava.store.product;

public class TVset extends BaseProduct{

    private float screenSize;
    private String inputs;
    private String screenType;

    public TVset(String name) {
        super(name);
    }

    public TVset(String name, float price, String description) {
        super(name, price, description);
    }

    public TVset(String name, String description) {
        super(name, description);
    }


    public void turnOn(){

    }

    public void turnOff(){

    }

    public void changeChannel(int channel){

    }

    public void changeChannel(String channel){
        System.out.println("Channel is "+channel);
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public String getInputs() {
        return inputs;
    }

    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }
}
