package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CardGenerateTest {

    @Test
    public void generateTest() {
        List<Card> res = CardGenerate.generate();
        List<Card> exp = List.of(
                new Card(Suit.Diamonds, Value.V_6),
                new Card(Suit.Hearts, Value.V_6),
                new Card(Suit.Spades, Value.V_6),
                new Card(Suit.Clubs, Value.V_6)
        );

        assertThat(res.get(0).getSuit(), is(exp.get(0).getSuit()));
    }
}