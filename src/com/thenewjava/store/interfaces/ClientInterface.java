package com.thenewjava.store.interfaces;

public interface ClientInterface {
    void newPurchase(ProductInterface product);
    void returnProduct(ProductInterface product);
}
