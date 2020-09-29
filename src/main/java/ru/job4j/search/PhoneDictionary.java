package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (person.getName().contains(key)
                    || person.getAddress().contains(key)
                    || person.getPhone().contains(key)
                    || person.getSurname().contains(key)) {

                result.add(person);
            }
        }
        return result;
    }

    public ArrayList<Person> findBy(String key) {

        Predicate<Person> predName = (person) -> person.getName().contains(key);
        Predicate<Person> predSurname = (person) -> person.getSurname().contains(key);
        Predicate<Person> predPhone = (person) -> person.getPhone().contains(key);
        Predicate<Person> predAdress = (person) -> person.getAddress().contains(key);
        Predicate<Person> combine = predName.or(predSurname).or(predPhone).or(predAdress);
        ArrayList<Person> result = new ArrayList<>();

        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
