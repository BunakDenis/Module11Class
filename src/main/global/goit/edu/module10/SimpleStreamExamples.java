package main.global.goit.edu.module10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimpleStreamExamples {

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(10));
        }

        System.out.println("randomNumbers = " + randomNumbers);

        int sum = randomNumbers
                .stream()
                .mapToInt(it -> it)
                .filter(it -> it % 2 == 0)
                .sum();

        System.out.println("sum = " + sum);

    }

}
