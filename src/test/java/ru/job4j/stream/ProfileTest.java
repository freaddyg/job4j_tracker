package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfileTest {

    private List<Profile> profiles = new ArrayList<>();

    @Before
    public void setUp() {
        profiles.add(new Profile(new Address("Nizhniy Novgorod", "Bul'var", 13, 22)));
        profiles.add(new Profile(new Address("Nizhniy Novgorod", "Bul'var", 13, 22)));
        profiles.add(new Profile(new Address("Moscow", "Timiryazevskaya", 15, 6)));
    }

    @Test
    public void whenCollectClassA() {
        List<Address> rsl = Profile.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", "Timiryazevskaya", 15, 6));
        expected.add(new Address("Nizhniy Novgorod", "Bul'var", 13, 22));

        assertThat(rsl.get(0).getCity(), is(expected.get(0).getCity()));
    }
}