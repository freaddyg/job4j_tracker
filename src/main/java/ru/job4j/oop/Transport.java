package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();

        Vehicle[] transport = new Vehicle[] {train, bus, plane};

        for (Vehicle tr : transport) {
                tr.move();
            System.out.println(tr.countPass() + " пассажиров");
            System.out.println();
        }
    }
}
