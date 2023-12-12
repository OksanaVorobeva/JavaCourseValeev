package lesson7.hashCode;

public class Pair {
    char a, b;

    @Override
    public int hashCode() {
        return (a << 16) + b;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pair)) return false;
        Pair pair = (Pair) obj;
        return a == pair.a && b == pair.b;
    }
}
