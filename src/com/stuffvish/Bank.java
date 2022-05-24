package com.stuffvish;

public interface Bank {
}
    class SBIBank implements Bank{
        // here we need to give the defination of all inherited mtds.
        // or 	declare this class as an abstract class
        public int getFixedInterestRate(){

            return 7;
        }
        public int getSavingInterestRate(){

            return 5;
        }
    }
    class ICICI implements Bank{
        public int getFixedInterestRate() {

            return 8;
        }
        public int getSavingInterestRate() {

            return 6;
        }
    }
    class MyJavaClass{
        public static void main(String[] args) {
            SBIBank sbobj = new SBIBank();
            System.out.println("..... SBI Bank .....");
            System.out.println("Saving: " + sbobj.getSavingInterestRate());
            System.out.println("Fixed: " + sbobj.getFixedInterestRate());
            System.out.println("===================");
            ICICI icobj = new ICICI();
            System.out.println("..... ICICI Bank....");
            System.out.println("Saving: " + icobj.getSavingInterestRate());
            System.out.println("Fixed: " + icobj.getFixedInterestRate());
        }
    }
