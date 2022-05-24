package com.stuffvish;

class MultiThreadingDemo extends Thread{
    public void run() {
        try{
            System.out.println("Thread " + currentThread().getId() + "is running");
        }
        catch(Exception e){
            System.out.println("Exception found!");
        }
    }
}
public class MultiThreading{
    public static void main(String[] args) {
        int n = 0;
        for(int i = 0; i < n; i++){
            MultiThreadingDemo multiThreadingDemo = new MultiThreadingDemo();
            multiThreadingDemo.start();
        }
    }
}
