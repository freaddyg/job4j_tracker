package ru.job4j.other.cond;

import ru.job4j.other.cond.Profession;

public class Doctor extends Profession {
    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}
