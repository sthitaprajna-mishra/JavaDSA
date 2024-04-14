package com.sthmishra.practice.interview.casting;

public class Client {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Dog dog2 = (Dog)dog;
        dog2.wagTail();
    }
}
