package lesson9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorTask {
    public static void main(String[] args) {
        System.out.println(stringByLength(Arrays.asList("a", "bb", "c", "dd", "eee")));
        System.out.println(stringByLengthAndFirstLetter(Arrays.asList("a", "b", "aa", "ab", "ba")));

    }

    static Map<Integer, String> stringByLength(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(String::length,
                Collectors.joining("+")));
    }

    static Map<Integer, Map<Character, List<String>>>
    stringByLengthAndFirstLetter(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(String::length
                , Collectors.groupingBy(s -> s.charAt(0))));
    }
}
