package com.LabMST;

import java.io.*;
import java.util.Scanner;

class WorkerDetail{
    /*
     * Name - Vishal Pandey
     * UID - 19BCS2930
     */
    int code,salary;
    String WorkerName;
    void SetData() throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("Enter Employee Code :");
        s=bf.readLine();
        code=Integer.parseInt(s);
        System.out.println("Enter Name of Employee :");
        WorkerName=bf.readLine();
        System.out.println("Enter Basic Salary ");
        s=bf.readLine();
        salary=Integer.parseInt(s);
    }
    void ShowDetail(){
        System.out.println("Code :"+ code);
        System.out.println("Name : "+WorkerName);
        System.out.println("Salary :"+salary);
    }
}
class EmployeeDetails{
    public static void main(String[] args)
    {
        int i;
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the value of employees data: ");
            int n = sc.nextInt();

            // For adding the details of the worker
            WorkerDetail[] Worker =new WorkerDetail[n];
            System.out.println("Enter the Details of " + n + " Workers");
            for(i=0;i < n;i++){
                Worker[i]=new WorkerDetail();
                Worker[i].SetData();
            }

            // For Printing the details of the workers
            System.out.println("The details of three Worker are:");
            for(i=0; i < n;i++){
                Worker[i].ShowDetail();
            }
        }
        catch(IOException e){
            System.out.println("Exception Caught! ");
        }
    }
}