package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        List<Card> cards = Stream.of(Suit.values())
                            .flatMap(e -> Stream.of(Value.values())
                            .map(el -> new Card(e, el)))
                            .collect(Collectors.toList());
    }
}

