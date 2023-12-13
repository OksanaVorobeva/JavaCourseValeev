package lesson9.collector;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector.Characteristics;

public interface Collector<T, A, R> {

    //создать накопитель

    Supplier<A> supplier();

    //добавить в накопитель

    BiConsumer<A, T> accumulator();

    //склеить два накопителя

    BinaryOperator<A> combiner();

    //Преобразовать накопитель в результат

    Function<A,R> finisher();

    //Флаги(ерунда всякая)

    Set<Characteristics> characteristics();


}
