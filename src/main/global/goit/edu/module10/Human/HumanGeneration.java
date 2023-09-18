package main.global.goit.edu.module10.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HumanGeneration {

    public List<Human> generation (int count) {

        Random random = new Random();

        List<String> firstNames = List.of("John", "Mark", "Bill", "Larry", "Igor", "Denis");
        List<String> lastNames = List.of("Gets", "Mask", "Bunak", "Petrov", "Koline", "Javov");

        List<Human> result = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String firstName = firstNames.get(random.nextInt(firstNames.size()));
            String lastName = lastNames.get(random.nextInt(lastNames.size()));
            String fullName = firstName + " " + lastName;

            int salary = 500 + random.nextInt(1001);

            result.add(new Human(fullName, salary));
        }
        return result;
    }

}
