package com.thenewjava.store.warehouse;

import com.thenewjava.store.interfaces.ClientInterface;
import com.thenewjava.store.interfaces.ProductInterface;
import com.thenewjava.store.interfaces.StaffMemberInterface;
import com.thenewjava.store.product.BaseProduct;

import java.util.ArrayList;

public class ShoppingRoom extends BaseWarehouse {

    private ArrayList<StaffMemberInterface> sellers;
    private ArrayList<ProductInterface> products;
    private ArrayList<Department> departments;

    public ArrayList<ClientInterface> getClients() {
        return clients;
    }

    public void setClients(ArrayList<ClientInterface> clients) {
        this.clients = clients;
    }

    private ArrayList<ClientInterface> clients;

    public ShoppingRoom(String name) {
        super(name);
    }

    public ArrayList<StaffMemberInterface> getSellers() {
        return sellers;
    }

    public void setSellers(ArrayList<StaffMemberInterface> sellers) {
        this.sellers = sellers;
    }

    public ArrayList<ProductInterface> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductInterface> products) {
        this.products = products;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }
}
