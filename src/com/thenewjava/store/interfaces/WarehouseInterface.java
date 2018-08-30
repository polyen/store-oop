package com.thenewjava.store.interfaces;

public interface WarehouseInterface {

    String getName();
    void recieveProduct(ProductInterface product);
    void moveProduct(ProductInterface product);
}
