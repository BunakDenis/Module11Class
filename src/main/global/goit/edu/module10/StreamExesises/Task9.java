package main.global.goit.edu.module10.StreamExesises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Task9 {

    public static void main(String[] args) {

        Employee sara = new Employee("Sara", 15);
        Employee victor = new Employee("Victor", 20);
        Employee eva = new Employee("Eva", 18);
        Employee denis = new Employee("Denis", 33);

        List<Employee> employees = Arrays.asList(sara, victor, eva, denis);

        String namesOfEmployees = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", ", "Names : ", "."));

        System.out.println("namesOfEmployees = " + namesOfEmployees);

    }

}
