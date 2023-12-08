package lesson6;

import java.util.AbstractList;
import java.util.RandomAccess;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class List {
    public static void main(String[] args) {
        System.out.println(rangeList(10,20).get(0));
        System.out.println(rangeList(10,20));
        System.out.println(rangeList(10,20).subList(3,7));

    }

   /* static java.util.List<Integer> rangeList(int fromInclusive, int toExclusive) {
        return new AbstractList<>() {
            @Override
            public Integer get(int index) {
                if (index < 0 || index >= size()) {
                    throw new IndexOutOfBoundsException(index);
                }
                return fromInclusive + index;
            }

            @Override
            public int size() {
                return toExclusive - fromInclusive;
            }
        };
    }*/

    static java.util.List<Integer> rangeList(int fromInclusive, int toExclusive){
        return new RangeList(fromInclusive,toExclusive);
    }

    private static class RangeList extends AbstractList<Integer> implements RandomAccess{

        private final  int fromInclusive,toExclusive;

        public RangeList(int fromInclusive, int toExclusive) {
            this.fromInclusive = fromInclusive;
            this.toExclusive = toExclusive;
        }

        @Override
        public int size() {
            return toExclusive-fromInclusive;
        }

        @Override
        public boolean contains(Object o) {
            return o instanceof Integer && (Integer) o>=fromInclusive && (Integer) o < toExclusive;
        }


        @Override
        public Integer get(int index) {
            if (index<0||index>=size()){
                throw  new IndexOutOfBoundsException(index);
            }
            return fromInclusive+index;
        }

        @Override
        public int indexOf(Object o) {
            if (contains(o)){
                return ((Integer) o)-fromInclusive;
            }
        return  -1;
        }

        @Override
        public int lastIndexOf(Object o) {
            return indexOf(o);
        }

        @Override
        public java.util.List<Integer> subList(int fromIndex, int toIndex) {
            if (fromIndex<0){
                throw  new IndexOutOfBoundsException("fromIndex = "+fromIndex);
            }
            if (toIndex>size()){
                throw new IndexOutOfBoundsException("toIndex = "+ toIndex);
            }
            if (fromIndex>toIndex){
                throw new IllegalArgumentException("fromIndex("+ fromIndex + ") > to index(" + toIndex + ")");
            }
            return  new RangeList(fromInclusive+fromIndex,fromInclusive+toIndex);
        }

        @Override
        public Stream<Integer> stream() {
            return IntStream.range(fromInclusive,toExclusive).boxed();
        }

        @Override
        public Stream<Integer> parallelStream() {
            return stream().parallel();
        }
    }
}
