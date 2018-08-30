package com.thenewjava.store.client;

import com.thenewjava.store.interfaces.ClientInterface;
import com.thenewjava.store.interfaces.ProductInterface;
import com.thenewjava.store.product.BaseProduct;

public abstract class BaseClient implements ClientInterface {

    public BaseClient() {
    }


    public void newPurchase(ProductInterface product){
        System.out.println("I've bought this "+product.getName() + " that guy told me: " + product.getDescription());
    }

    public void returnProduct(ProductInterface product){

    }

}
