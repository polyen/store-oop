package com.thenewjava.store.client;

import com.thenewjava.store.interfaces.ProductInterface;
import com.thenewjava.store.staff.PersonalInfo;

public class RegisteredClient extends BaseClient {

    private PersonalInfo personalInfo;
    private String cardNumber;
    private int discount;
    private String purchaseHistory;

    public RegisteredClient(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    @Override
    public void newPurchase(ProductInterface product){
        super.newPurchase(product);
        //Adding goods to the purchase history
    }

    @Override
    public void returnProduct(ProductInterface product){
        super.returnProduct(product);
        //Remove from the purchase history
    }


    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
}
