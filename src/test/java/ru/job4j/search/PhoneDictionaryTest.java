package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void findBySurname() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Yuriy", "Korsakov", "54696", "Nizhnii Novgorod")
        );
        ArrayList<Person> persons = phones.findBy("Kors");
        assertThat(persons.get(0).getAddress(), is("Nizhnii Novgorod"));

    }

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.findBy("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}