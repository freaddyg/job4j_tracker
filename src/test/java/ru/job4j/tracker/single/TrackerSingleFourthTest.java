package ru.job4j.tracker.single;

import org.junit.Test;
import ru.job4j.tracker.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerSingleFourthTest{

    @Test
    public  void singleTest() {
        TrackerSingleFourth firstObj = TrackerSingleFourth.INSTANCE;
        TrackerSingleFourth secondObj = TrackerSingleFourth.INSTANCE;


        assertThat(firstObj.hashCode(), is(secondObj.hashCode()));
    }
}