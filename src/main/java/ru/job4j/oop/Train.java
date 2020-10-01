package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Еду по рельсам");
    }

    @Override
    public int countPass() {
        return 1000;
    }
}
