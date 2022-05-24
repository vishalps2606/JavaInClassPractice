package com.stuffvish;

public class Member {
    String name;
    int age;
    int phone_no;
    String address;
    double salary;

    public void printSalary() {
        System.out.println(salary);    }
}
    class Employee extends Member {
        String specialization;
    }

    class Manager extends Member {
        String department;
    }

    class Ans{
    public static void main(String[] args){
        Employee object = new Employee();
        object.name = "Vishal";
        object.age = 20;
        object.phone_no = 65748;
        object.address = "Kanpur";
        object.salary = 41000;
        object.specialization = "xyz";

        System.out.println("Name is: " + object.name);
        System.out.println("Age is: " + object.age);
        System.out.println("Phone no. is: " + object.phone_no);
        System.out.println("Address is: " + object.address);
        System.out.println("Salary is: " + object.salary);
        System.out.println("Specialization is: " + object.specialization);

        Manager object1 = new Manager();
        object1.name = "Vishal1";
        object1.age = 21;
        object1.phone_no = 657481;
        object1.address = "Kanpur,";
        object1.salary = 410001.00;
        object1.department = "xyzx";
        object.printSalary();
    }
}