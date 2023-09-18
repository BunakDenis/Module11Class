package main.global.goit.edu.module10.StreamExesises;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {

    public static void main(String[] args) {
        List<List<String>> input = Arrays.asList(Arrays.asList("Victor", "Farcic"), Arrays.asList("John", "Doe", "Third"));

        List<String> result = input.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(result);

    }

}
