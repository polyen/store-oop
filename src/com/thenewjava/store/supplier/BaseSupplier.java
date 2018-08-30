package com.thenewjava.store.supplier;

import com.thenewjava.store.interfaces.ProductInterface;
import com.thenewjava.store.interfaces.SupplierInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class BaseSupplier implements SupplierInterface {
    private String name;
    private String location;
    private String phone;
    private Array supplyHistory;

    public void placeOrder(){

    }

    public ArrayList<ProductInterface> delivery() {
        return new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Array getSupplyHistory() {
        return supplyHistory;
    }

    public void setSupplyHistory(Array supplyHistory) {
        this.supplyHistory = supplyHistory;
    }
}
