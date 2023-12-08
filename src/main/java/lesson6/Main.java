package lesson6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

    }

    void printAll(Iterable<?> iterable) {
        Iterator<?> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.hasNext();
            System.out.println(object);
        }
    }

    //the same
    void printAll2(Iterable<?> iterable) {
        for (Object obj : iterable) {
            System.out.println(obj);
        }
    }

    void removeEmpty(Iterable<String> iterable) {
        Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isEmpty()) {
                iterator.remove();
            }
        }
    }

    static <T> Iterable<T> nCopies(T value, int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Negative count: " + count);
        }
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int rest = count;

                    @Override
                    public boolean hasNext() {
                        return rest > 0;
                    }

                    @Override
                    public T next() {
                        if (rest == 0) {
                            throw new NoSuchElementException();
                        }
                        rest--;
                        return value;
                    }
                };
            }
        };
    }

    static <T> Iterable<T> nCopies2(T value, int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Negative count: " + count);
        }
        return () -> new Iterator<T>() {
            int rest = count;

            @Override
            public boolean hasNext() {
                return rest > 0;
            }

            @Override
            public T next() {
                if (rest == 0) {
                    throw new NoSuchElementException();
                }
                rest--;
                return value;
            }
        };
    }
}


