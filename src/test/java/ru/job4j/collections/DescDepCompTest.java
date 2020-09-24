package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.collections.Departments.*;

public class DescDepCompTest {

    @Test
    public void compareTest() {
        int rsl = new DescDepComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DescDepComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenDownDepartmentGoAfter() {
        List<String> dep = new ArrayList<>();
        dep.add("K1/SK1");
        dep.add("K1/SK2");
        dep.add("K2/SK1");
        dep.add("K2/SK2");

        List<String> list = fillGaps(dep);
        sortDesc(list);

        assertThat(list.get(0), is("K2"));
    }

    @Test
    public void whenUpDepartment() {
        List<String> dep = new ArrayList<>();
        dep.add("K1/SK1");
        dep.add("K1/SK2");
        dep.add("K2/SK1");
        dep.add("K2/SK2");

        List<String> list = fillGaps(dep);
        sortAsc(list);

        assertThat(list.get(0), is("K1"));
    }
}