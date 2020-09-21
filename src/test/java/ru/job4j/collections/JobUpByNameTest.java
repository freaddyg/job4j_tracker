package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobUpByNameTest {
    @Test
    public void whenNameUp() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Ivan", 4));
        list.add(new Job("Sergey", 2));
        list.add(new Job("Andrey", 1));

        List<Job> exp = new ArrayList<>();
        exp.add(new Job("Andrey", 1));
        exp.add(new Job("Ivan", 4));
        exp.add(new Job("Sergeyr", 2));

        Collections.sort(list, new JobUpByName());

        assertThat(list.get(0).getName(), is(exp.get(0).getName()));
    }
}