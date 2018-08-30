package com.thenewjava.store.staff;

import com.thenewjava.store.interfaces.ClientInterface;
import com.thenewjava.store.interfaces.StaffMemberInterface;

import java.util.ArrayList;

public class Manager extends StaffMember{


    public Manager(PersonalInfo personalInfo, float salary) {
        super(personalInfo, salary);
    }

    public ArrayList<StaffMemberInterface> findFreeSeller(ArrayList<ClientInterface> clients, ArrayList<StaffMemberInterface> sellers){

        ArrayList<StaffMemberInterface> availableSellers = new ArrayList<StaffMemberInterface>();

        for (int i=0; i<clients.size(); i++){
            for (StaffMemberInterface seller: sellers) {
                if (((Seller)seller).isFree()){
                    availableSellers.add(seller);
                    ((Seller)seller).setFree(false);
                    break;
                }
            }
        }

        return availableSellers;
    };
    public void interview(){

    }

    public void findSupplier(){

    }

}
