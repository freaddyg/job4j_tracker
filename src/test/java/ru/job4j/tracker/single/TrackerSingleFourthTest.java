package ru.job4j.tracker.single;

import org.junit.Test;
import ru.job4j.tracker.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerSingleFourthTest {

    @Test
    public  void singleTest() {
        Tracker firstObj = TrackerSingleFourth.TRACKER.getInstanse();
        Tracker secondObj = TrackerSingleFourth.TRACKER.getInstanse();

        assertThat(firstObj.hashCode(), is(secondObj.hashCode()));
    }
}