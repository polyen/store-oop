package com.thenewjava.store.staff;

import com.thenewjava.store.interfaces.StaffMemberInterface;

import java.util.Date;

public abstract class StaffMember implements StaffMemberInterface {
    private PersonalInfo personalInfo;
    private float salary;

    public StaffMember(PersonalInfo personalInfo, float salary) {
        this.personalInfo = personalInfo;
        this.salary = salary;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void startWork(Date date) {

    }

    @Override
    public void stopWork(Date date) {

    }
}
