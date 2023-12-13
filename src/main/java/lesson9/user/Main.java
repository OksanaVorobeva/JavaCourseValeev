package lesson9.user;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    static Map<User, List<Department>> departmentByChief(Company company) {
        return company
                .departments()
                .collect(Collectors.groupingBy(Department::chief));
    }

    static Map<User, List<String>> departmentNamesByChief(Company company) {
        return company.departments()
                .collect(Collectors.groupingBy(Department::chief,
                        Collectors.mapping(Department::title, Collectors.toList())));
    }

    static Map<User, Set<User>> supervisors(Company company) {
        return company.departments()
                .collect(Collectors.groupingBy(Department::chief,
                        Collectors.flatMapping(Department::users, Collectors.toSet())));
    }
}
