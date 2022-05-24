package com.stuffvish;
//Constructor practice
public class Constructor {
    String Employee_name;
    int Employee_id;
    double Employee_salary;

   public Constructor(String Name, int id, double salary){
       this.Employee_name = Name;
       this.Employee_id = id;
       this.Employee_salary = salary;
   }
   public static void main(String[] args){
       Constructor object1 = new Constructor("Vishal", 2930, 4500000.00);
       Constructor object2 = new Constructor("Tarif", 2933, 4500000.00);
       Constructor object3 = new Constructor("Aman", 1848, 4500000.00);
       Constructor object4 = new Constructor("Sarthak", 3070, 4500000.00);
       Constructor object5 = new Constructor("Dhruv", 3067, 4500000.00);
       Constructor object6 = new Constructor("Ridham", 1838, 4500000.00);
       Constructor object7 = new Constructor("Ujjwal", 3041, 4500000.00);

       System.out.println("The name is: " + object1.Employee_name + " The id is:" + object1.Employee_id + " and SAlary is: " + object1.Employee_salary);
       System.out.println("The name is: " + object2.Employee_name + " The id is:" + object2.Employee_id + " and SAlary is: " + object2.Employee_salary);
       System.out.println("The name is: " + object3.Employee_name + " The id is:" + object3.Employee_id + " and SAlary is: " + object3.Employee_salary);
       System.out.println("The name is: " + object4.Employee_name + " The id is:" + object4.Employee_id + " and SAlary is: " + object4.Employee_salary);
       System.out.println("The name is: " + object5.Employee_name + " The id is:" + object5.Employee_id + " and SAlary is: " + object5.Employee_salary);
       System.out.println("The name is: " + object6.Employee_name + " The id is:" + object6.Employee_id + " and SAlary is: " + object6.Employee_salary);
       System.out.println("The name is: " + object7.Employee_name + " The id is:" + object7.Employee_id + " and SAlary is: " + object7.Employee_salary);
           }
       }
