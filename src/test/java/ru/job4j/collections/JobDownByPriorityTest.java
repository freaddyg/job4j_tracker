package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobDownByPriorityTest {
    @Test
    public void whenPriorityDown() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Ivan", 2));
        list.add(new Job("Sergey", 4));
        list.add(new Job("Andrey", 1));

        List<Job> exp = new ArrayList<>();
        exp.add(new Job("Seregy", 4));
        exp.add(new Job("Ivan", 2));
        exp.add(new Job("Andrey", 1));

        Collections.sort(list, new JobDownByPriority());

        assertThat(list.get(2).getPriority(), is(exp.get(2).getPriority()));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobUpByName().thenComparing(new JobUpByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Cat", 0),
                new Job("Cat", 1)
        );

        assertThat(rsl, is(-1));
    }
}