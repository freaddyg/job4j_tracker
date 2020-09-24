package ru.job4j.lambda;

import ru.job4j.collections.Attachment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {
    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate predicate = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment o) {
                return o.getSize() > 100;
            }
        };
        return filter(list, predicate);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate predicate = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment o) {
                return o.getName().contains("bug");
            }
        };
        return filter(list, predicate);
    }

    private static List<Attachment> filter(List<Attachment> in, Predicate<Attachment> pr) {
        List<Attachment> out = new ArrayList<>();
        for (Attachment att : in) {
            if (pr.test(att)) {
                out.add(att);
            }
        }
        return out;
    }

}
