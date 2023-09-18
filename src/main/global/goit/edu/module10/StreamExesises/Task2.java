package main.global.goit.edu.module10.StreamExesises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        final List<String> input = Arrays.asList("My", "name", "is", "John", "Doeu");
        final List<String> expected = Arrays.asList("My", "is");

        List<String> result = input.stream()
                .filter(word -> word.length() < 4)
                .toList();

        System.out.println(result);
        System.out.println("Is extend equals result - " + expected.equals(result));
    }

}
