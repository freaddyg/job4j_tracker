package ru.job4j.oop;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Еду по шоссе");
    }

    @Override
    public int countPass() {
        return 20;
    }
}
