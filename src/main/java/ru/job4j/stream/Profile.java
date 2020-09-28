package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public static List<Address> collect(List<Profile> profiles) {
        List<Address> addresses = profiles.stream()
                                        .map(prof -> prof.getAddress())
                                        .collect(Collectors.toList());
        return addresses;
    }
}
