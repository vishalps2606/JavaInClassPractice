package com.stuffvish;

class Employee1 implements Cloneable {
    /*
     * Name - Vishal Pandey
     * UID - 19BCS2930
     */
    private String name;

    public Employee1(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Employee1 clone() {
        try {
            return (Employee1) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Not Allowed");
            return this;
        }
    }
}

public class ST2 {

    public static void main(String[] args) {
        Employee1 emp = new Employee1("Vishal Pandey");
        Employee1 empClone = emp.clone();

        empClone.setName("New Name Vishal Pandey");

        System.out.println(empClone.getName());
        System.out.println(emp.getName());
    }

}