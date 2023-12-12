package lesson7.comparable;

public class User implements Comparable<User>{
    //естественный порядок
    final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return name.compareTo(o.name);
    }
}
