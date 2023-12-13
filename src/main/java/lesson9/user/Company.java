package lesson9.user;

import java.util.stream.Stream;

public interface Company {
    Stream<Department> departments();
}
