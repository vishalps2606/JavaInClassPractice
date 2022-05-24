package com.stuffvish;

// Write a program to use the concepts of abstract class
// Name- Vishal Pandey CSE-11(A)
// UID- 19BCS2930

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    // implementation of abstract method
    public void makeSound() {
        System.out.println("Dog sound barks.");
    }
}

class Cat extends Animal {
// implementation of abstract method
    public void makeSound() {
        System.out.println("Cat sound Meows ");
    }
}

public class Final_Exam {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();

        Cat c1 = new Cat();
        c1.makeSound();
    }
}
