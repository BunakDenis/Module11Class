package main.global.goit.edu.module10.StreamExesises;

import java.util.Arrays;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);

        Integer result = input.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of elements of List " + result);

    }
}