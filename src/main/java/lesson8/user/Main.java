package lesson8.user;

public class Main {
    void increaseUserCarma(UserRepository repository,String name){
        repository.findUser(name)
                .filter(User::isActive)
                .orElseThrow(()->new IllegalArgumentException("No such user" +name))
                .updateCarma(1);
    }
}
