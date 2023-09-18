package main.global.goit.edu.module10.StreamExesises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        //Exercise 1
        final List<String> input = Arrays.asList("My", "name", "is", "John", "Doe");
        final List<String> extend = Arrays.asList("MY", "NAME", "IS", "JOHN", "DOE");

        List<String> result = input.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);

        System.out.println("Is list input extends result - " + extend.equals(result));

    }

}