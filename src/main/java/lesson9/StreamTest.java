package lesson9;

import lesson8.Main;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    static final String PREFIX = "--";

    public static void main(String[] args) {
        int[] array = Stream.of("1", "2", "", "4", "5")
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        //   System.out.println(Arrays.toString(array));

        long numberOfOptions = Stream.of(args)
                .filter(x -> x.startsWith("--"))
                .count();

        System.out.println(numberOfOptions);

        Stream.of(args)
                .filter(x -> x.startsWith(PREFIX))
                .findFirst()
                .map(x -> x.substring(PREFIX.length()))
                .ifPresentOrElse(x -> System.out.println("Option supplied:" + x),
                        () -> System.out.println("No option supplied"));
        //.ifPresent(x->System.out.println("Option supplied: "+x));

        boolean hasOption = Stream.of(args)
                .anyMatch(x -> x.startsWith(PREFIX));

        //Короткое замыкание
        List<List<String>> listOfLists =
                List.of(List.of("foo", "bar", "baz"),
                        List.of("Java", "Kotlin", "Groovy"),
                        List.of("Hello", "Good Bye"));
        System.out.println(listOfLists.stream()
                .flatMap(List::stream)
                .peek(System.out::println)
                .anyMatch("Java"::equals));


    }

    //reduce()
    static BigInteger factorial(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }

    public List<String> processList(List<String> list) {
        return list.stream()
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
    }
}
