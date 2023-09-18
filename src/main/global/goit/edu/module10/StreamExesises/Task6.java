package main.global.goit.edu.module10.StreamExesises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    public static void main(String[] args) {
        Employee sara = new Employee("Sara", 15);
        Employee victor = new Employee("Victor", 20);
        Employee eva = new Employee("Eva", 18);
        Employee denis = new Employee("Denis", 33);

        List<Employee> employees = Arrays.asList(sara, victor, eva, denis);

        List<String> Names = employees.stream()
                .filter(employee -> employee.getAge() < 25)
                .map(Employee::getName)
                .toList();

        System.out.println(Names);
    }
}
