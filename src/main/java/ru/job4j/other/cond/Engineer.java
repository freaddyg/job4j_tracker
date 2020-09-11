package ru.job4j.other.cond;

import ru.job4j.other.cond.Profession;

public class Engineer extends Profession {
    public Drawing takeDrawing() {
        return new Drawing();
    }
}
