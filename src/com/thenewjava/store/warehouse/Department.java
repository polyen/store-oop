package com.thenewjava.store.warehouse;

public class Department {

    private String name;
    private String Sellers;

    public Department(String name) {
        this.name = name;
    }

    public void setSellers(String sellers) {
        Sellers = sellers;
    }

    public String getName() {
        return name;
    }

    public String getSellers() {
        return Sellers;
    }
}
