package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CardGenerate {
    public static List<Card> generate() {
       return Stream.of(Suit.values())
                        .flatMap(e -> Stream.of(Value.values())
                        .map(el -> new Card(e, el)))
                        .collect(Collectors.toList());
    }
}
