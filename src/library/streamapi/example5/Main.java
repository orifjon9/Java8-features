package library.streamapi.example5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by orifjon9 on 3/17/2017.
 */
public class Main {

    public static void main(String[] args) {
        //[{“A”, “B”}, {“D”}, {“1”, “3”, “5”}]
        Set<String> set1 = Stream.of(new String[]{"A", "B"}).collect(Collectors.toSet());
        Set<String> set2 = Stream.of(new String[]{"D"}).collect(Collectors.toSet());
        Set<String> set3 = Stream.of(new String[]{"1", "2", "3"}).collect(Collectors.toSet());

        List<Set<String>> sets = Arrays.asList(set1, set2, set3);

        List<String> lists = sets.stream()
                .map(set -> set.stream().collect(Collectors.toList()))
                .reduce((x, y) -> joinTwoArray(x, y))
                .get();

        System.out.println(lists);
    }

    public static List<String> joinTwoArray(List<String> firstList, List<String> secondList) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        return list;
    }
/*
    public static <T> List<T> joinTwoArrayGeneric(List<T> firstList, List<T> secondList) {
        ArrayList<T> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        return list;
    }*/
}
