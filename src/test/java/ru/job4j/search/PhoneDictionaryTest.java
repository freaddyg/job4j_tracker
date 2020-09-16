package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void findTest() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Yuriy", "Korsakov", "54696", "Nizhnii Novgorod")
        );
        ArrayList<Person> persons = phones.find("Yuriy");
        assertThat(persons.get(0).getAddress(), is("Nizhnii Novgorod"));
    }
}