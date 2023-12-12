package lesson7.comparable;

public class User4 implements Comparable<User4>{

    private final double income;

    public User4(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return String.valueOf(income);
    }

    @Override
    public int compareTo(User4 o) {
        return Double.compare(this.income,o.income);
    }
}
