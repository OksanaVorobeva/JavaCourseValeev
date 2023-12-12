package lesson7.userTask;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository= new UserRepository();
        userRepository.addUser(new User(true));
        userRepository.addUser(new User(false));
        userRepository.validateAll();
    }
}
