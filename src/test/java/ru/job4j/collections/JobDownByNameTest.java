package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobDownByNameTest {
    @Test
    public void whenNameDown() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Ivan", 4));
        list.add(new Job("Sergey", 2));
        list.add(new Job("Andrey", 1));

        List<Job> exp = new ArrayList<>();
        exp.add(new Job("Sergey", 2));
        exp.add(new Job("Ivan", 4));
        exp.add(new Job("Andrey", 1));

        Collections.sort(list, new JobDownByName());

        assertThat(list.get(2).getName(), is(exp.get(2).getName()));
    }

}