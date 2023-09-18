package main.global.goit.edu.module10.OptionalTest;

import java.util.Optional;

public class UserTests {

    public static void main(String[] args) {
        UsersService usersService = new UsersService();

        Optional<User> userOptional = usersService.findByEmail("xisi926@ukr.net");

//        User user = userOptional.orElse(new User("default.gmail.com", "defaultUser"));

        userOptional.orElseGet(() -> new User("default.gmail.com", "defaultUser"));

        userOptional.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No user found")
        );



    }
}