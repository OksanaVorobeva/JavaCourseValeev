package lesson7.comparable;

public class User3 implements Comparable<User3> {
    private int age;

    public User3(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User3 o) {
        return Integer.compare(this.age,o.age);
    }

    @Override
    public String toString() {
        return String.valueOf(age);
    }
}
