package lesson7.comparable;

import java.util.Comparator;

public class User5 implements Comparable<User5> {

    private final String name;
    private final int age;

    public User5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User5 o) {
        int res = name.compareTo(o.name);
        return res == 0 ? Integer.compare(this.age, o.age) : res;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    static final Comparator<User5> USER_5_COMPARATOR = (u1, u2) -> {
        int res = u1.getName().compareTo(u2.getName());
        return res == 0 ? Integer.compare(u1.getAge(), u2.getAge()) : res;
    };

}
