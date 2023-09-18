package main.global.goit.edu.module10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    private static List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee(52, "Bogdan"),
            new Employee(15, "Misha"),
            new Employee(41, "Sergey"),
            new Employee(1, "Dima"),
            new Employee(27, "Denis"),
            new Employee(60, "Anton"),
            new Employee(5, "Oleksandr"),
            new Employee(18, "Max"),
            new Employee(32, "Vitaley")
    ));

    public static void main(String[] args) {
        List<String> employeersWithStream = employees.stream()
                .sorted((Comparator.comparingInt(Employee::getId)))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(employeersWithStream);

    }

}
