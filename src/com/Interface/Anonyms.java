package com.Interface;

public class Anonyms {
    public static void main(String[] args)
    {
        // Create an instance of an anonymous class that implements Animal
        Animal animal = new Animal() {
            @Override
            public void bark() {
                System.out.println("Dog barking...");
            }
        };
        animal.bark();
    }
}
