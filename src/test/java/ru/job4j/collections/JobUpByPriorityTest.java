package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobUpByPriorityTest {

    @Test
    public void whenPriorityUp() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Ivan", 2));
        list.add(new Job("Sergey", 4));
        list.add(new Job("Andrey", 1));

        List<Job> exp = new ArrayList<>();
        exp.add(new Job("Andrey", 1));
        exp.add(new Job("Ivan", 2));
        exp.add(new Job("Sergey", 4));

        Collections.sort(list, new JobUpByPriority());

        assertThat(list.get(0).getPriority(), is(exp.get(0).getPriority()));
     }
}