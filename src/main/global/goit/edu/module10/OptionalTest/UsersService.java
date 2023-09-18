package main.global.goit.edu.module10.OptionalTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersService {

    private List<User> users;

    public UsersService () {
        users = new ArrayList<>();

        users.add(new User("xisi926@ukr.net", "Denis"));
        users.add(new User("dbunak.ns@gmail.com", "Valera"));
    }

    public void addUser (String email, String name) {
        users.add(new User(email,name));
    }

    public Optional<User> findByEmail (String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
