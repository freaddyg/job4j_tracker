package ru.job4j.tracker;

public class Doctor extends Profession{
    public Diagnosis heal(Pacient pacient){
        return new Diagnosis();
    }
}
