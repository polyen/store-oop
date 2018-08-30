package com.thenewjava.store;

import com.thenewjava.store.client.RegularClient;
import com.thenewjava.store.interfaces.ClientInterface;
import com.thenewjava.store.interfaces.ProductInterface;
import com.thenewjava.store.interfaces.StaffMemberInterface;
import com.thenewjava.store.interfaces.WarehouseInterface;
import com.thenewjava.store.product.*;
import com.thenewjava.store.staff.Manager;
import com.thenewjava.store.staff.PersonalInfo;
import com.thenewjava.store.staff.Seller;
import com.thenewjava.store.staff.StaffMember;
import com.thenewjava.store.warehouse.ShoppingRoom;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        WarehouseInterface shopingRoom = new ShoppingRoom("Main");

        ArrayList<ProductInterface> products = new ArrayList<>();
        products.add(new Tablet("Samsung", 6399,"Best tablet ever"));
        products.add(new Phone("Lenovo", 4200, "regular phone with 2 sim cards..."));
        products.add(new Laptop("Dell", 4200, "Laptop for you!!"));
        products.add(new Microwave("LG", 4200, "smell it! Your popcorn is ready!!!"));
        products.add(new Iron("Philips", 4200, "You gonna be like new!"));



        StaffMember manager = new Manager(new PersonalInfo("Big Bro"), 10000);



        ((ShoppingRoom) shopingRoom).setProducts(products);

        Random random = new Random();

        int iterator = 0;

        while (iterator < 10) {
            ArrayList<StaffMemberInterface> sellers= new ArrayList<StaffMemberInterface>();
            sellers.add(new Seller(new PersonalInfo("John"), 8300));
            sellers.add(new Seller(new PersonalInfo("Brian"), 8300));
            sellers.add(new Seller(new PersonalInfo("Geek"), 8900));

            ((ShoppingRoom) shopingRoom).setSellers(sellers);

            ((ShoppingRoom) shopingRoom).setClients(addClients());

            System.out.println("shopingRoom = " + ((ShoppingRoom) shopingRoom).getClients().size());

            ArrayList<StaffMemberInterface> availableSellers = ((Manager) manager).findFreeSeller(((ShoppingRoom) shopingRoom).getClients(), ((ShoppingRoom) shopingRoom).getSellers());

            for (StaffMemberInterface seller: availableSellers) {

                ProductInterface productToSell = products.get(random.nextInt(products.size()));

                System.out.println("seller is = "+ ((Seller)seller).getPersonalInfo().getName());
                System.out.println("this item? - ooo, "+((Seller) seller).describeProduct(productToSell));

                if (random.nextInt(10) > 5) {
                    ((ShoppingRoom) shopingRoom).getClients().get(random.nextInt(((ShoppingRoom) shopingRoom).getClients().size())).newPurchase(productToSell);
                } else {
                    System.out.println("well... I don't like it");
                }

                }




            iterator++;
        }
    }

    private static ArrayList<ClientInterface> addClients(){

        Random random = new Random();
        int q = random.nextInt(3);

        ArrayList<ClientInterface> clients = new ArrayList<ClientInterface>();

        for (int i=0; i<q; i++){
            clients.add(new RegularClient());
        }

        return clients;
    }
}
