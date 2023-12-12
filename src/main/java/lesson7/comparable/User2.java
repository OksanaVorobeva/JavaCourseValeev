package lesson7.comparable;

public class User2 implements Comparable<User2>{
    private  boolean valid;

    public User2(boolean valid) {
        this.valid = valid;
    }

     boolean isValid() {
        return valid;
    }

    @Override
    public int compareTo(User2 o) {
        return Boolean.compare(this.valid,o.valid);
    }

    @Override
    public String toString() {
        return String.valueOf(valid);
    }
}
