package lesson7;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    static Map<Integer, String> getIntegerToStringMap(int count) {
        return new AbstractMap<Integer, String>() {

            @Override
            public boolean containsKey(Object key) {
                return key instanceof Integer && ((Integer) key) >= 0 && ((Integer) key) < count;
            }

            @Override
            public String get(Object key) {
                return containsKey(key) ? key.toString() : null;
            }

            @Override
            public Set<Entry<Integer, String>> entrySet() {
                return new AbstractSet<Entry<Integer, String>>() {
                    @Override
                    public Iterator<Entry<Integer, String>> iterator() {
                        return new Iterator<Entry<Integer, String>>() {
                            int next = 0;

                            @Override
                            public boolean hasNext() {
                                return next < count;
                            }

                            @Override
                            public Entry<Integer, String> next() {
                                if (next == count) throw new NoSuchElementException();
                                return new AbstractMap.SimpleImmutableEntry<>(
                                        next, String.valueOf(next++));
                            }
                        };
                    }

                    @Override
                    public int size() {
                        return count;
                    }
                };
            }
        };
    }
}
