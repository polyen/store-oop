package com.thenewjava.store.warehouse;

import com.thenewjava.store.interfaces.ProductInterface;
import com.thenewjava.store.interfaces.WarehouseInterface;
import com.thenewjava.store.product.BaseProduct;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class BaseWarehouse implements WarehouseInterface {
    private String location;
    private String name;
    private ArrayList<ProductInterface> productAvailability;

    public BaseWarehouse(String name) {
        this.name = name;
    }

    public void recieveProduct(ProductInterface product){

    }

    public void moveProduct(ProductInterface product){

    }

    public int getAmmount(ProductInterface product){
        return 0;// Just for error messages
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ProductInterface> getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(ArrayList<ProductInterface> productAvailability) {
        this.productAvailability = productAvailability;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    private String responsible;


}
