package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Лечу в небе");
    }

    @Override
    public int countPass() {
        return 250;
    }
}
