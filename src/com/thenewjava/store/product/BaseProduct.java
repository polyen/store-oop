package com.thenewjava.store.product;


import com.thenewjava.store.interfaces.ProductInterface;
import com.thenewjava.store.warehouse.Department;

public abstract class BaseProduct implements ProductInterface {
    private String name;
    private String model;
    private int amount;
    private float price;
    private Dimensions dimensions;
    private String vendor;
    private Department department;
    private String description;


    public BaseProduct(String name) {
        this.name = name;
    }

    public BaseProduct(String name, float price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public BaseProduct(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
