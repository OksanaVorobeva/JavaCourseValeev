package lesson6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Set {
    public static void main(String[] args) {
        System.out.println(rangeSet(10, 20).contains(10));
        System.out.println(rangeSet(10, 20).contains(20));
        System.out.println(rangeSet(10, 20));
        System.out.println(rangeSet(0, Integer.MAX_VALUE).contains(-1));
    }

    static java.util.Set<Integer> rangeSet(int fromInclusive, int toExclusive) {
        return new AbstractSet<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    int next = fromInclusive;

                    @Override
                    public boolean hasNext() {
                        return next != toExclusive;
                    }

                    @Override
                    public Integer next() {
                        if (next == toExclusive) {
                            throw new NoSuchElementException();
                        }
                        return next++;
                    }
                };
            }

            @Override
            public int size() {
                return toExclusive - fromInclusive;
            }

            @Override
            public boolean contains(Object o) {
                return o instanceof Integer && ((Integer) o) >= fromInclusive && ((Integer) o) < toExclusive;
            }
        };
    }
}
