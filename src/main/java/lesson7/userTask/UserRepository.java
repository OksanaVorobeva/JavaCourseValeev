package lesson7.userTask;

import java.util.HashSet;
import java.util.Set;

public class UserRepository {

    private Set<User> users;

    public UserRepository() {
        this.users =new HashSet<>();
    }

    void  addUser(User user){
        users.add(user);
    }

    void validateUser(User user){
        if (!user.isValid()){
            users.remove(user);
        }
    }

    void  validateAll(){
        for (User user: users) {
            validateUser(user);
        }
    }
}
