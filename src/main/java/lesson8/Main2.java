package lesson8;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        Predicate<String> predicate = "Java"::equals;

        System.out.println(predicate.test("Java"));
        System.out.println(predicate.test("Kotlin"));

        Consumer<String> lambdaPrinter = objects -> System.out.println(objects);
        Consumer<String> methodRefPrinter = System.out::println;
        //  System.setOut(null);
        methodRefPrinter.accept("hello");
        lambdaPrinter.accept("hello");

        Function<Integer, Integer> inc = bind(Integer::sum, 1);
        System.out.println(inc.apply(10));

        System.out.println(curry(Integer::sum).apply(5).apply(6));
    }

    //gПривязка аргумента
    static <A, B, C> Function<B, C> bind(BiFunction<A, B, C> fn, A a) {
        Objects.requireNonNull(fn);
        return b -> fn.apply(a, b);
    }

    //копирование

    static <A, B, C> Function<A, Function<B, C>> curry(BiFunction<A, B, C> function) {
        return a -> b -> function.apply(a, b);
    }


}
