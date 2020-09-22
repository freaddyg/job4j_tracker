package ru.job4j.tracker;

public class StubInput implements Input {
    private String[] ansvers;
    private int position = 0;

    public StubInput(String[] ansvers) {
        this.ansvers = ansvers;
    }

    @Override
    public String askStr(String question) {
        return  ansvers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
