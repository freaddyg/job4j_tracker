package ru.job4j.stream;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StreamMatrixTest {

    @Test
    public void convertTest() {
        StreamMatrix sm = new StreamMatrix();
        Integer[][] matrix = new Integer[][] {{1, 2}, {3, 4}};
        List<Integer> rsl = sm.convert(matrix);
        List<Integer> exp = Arrays.asList(1, 2, 3, 4);

        assertThat(rsl, is(exp));
    }
}