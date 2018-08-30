package com.thenewjava.store.staff;

import com.thenewjava.store.interfaces.ProductInterface;
import com.thenewjava.store.product.BaseProduct;
import java.lang.reflect.Array;

public class Seller extends StaffMember{

    private Array sellingHistory;
    private boolean isFree = true;

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }




    public Seller(PersonalInfo personalInfo, float salary) {
        super(personalInfo, salary);
    }


    public void saleProduct(BaseProduct product){

    }

    public void bringProduct(){

    }

    public String describeProduct(ProductInterface product){
         return product.getDescription() + ". Sale price, only today, just "+product.getPrice();
    }


    public Array getSellingHistory() {
        return sellingHistory;
    }

    public void setSellingHistory(Array sellingHistory) {
        this.sellingHistory = sellingHistory;
    }


}
