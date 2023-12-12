package lesson8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
    public static void main(String[] args) {
        /*IntStream.range(1, 10)
                .boxed()
                .sorted((a, b) -> Math.random() > 0.5 ? 1 : -1)
                .forEach(System.out::println);
    }*/
  /*      List<Integer> list = IntStream.range(1, 50)
                .boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        list.forEach(System.out::println);*/

        IntStream.iterate(1,x->x*2)
                .limit(10)
                .sorted()
                .forEach(System.out::println);
    }
}
