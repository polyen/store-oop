package com.thenewjava.store.interfaces;

import java.util.ArrayList;

public interface SupplierInterface {

    String getName();
    void placeOrder();
    ArrayList<ProductInterface> delivery();

}
