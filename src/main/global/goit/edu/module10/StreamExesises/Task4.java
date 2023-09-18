package main.global.goit.edu.module10.StreamExesises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task4 {

    public static void main(String[] args) {

        Employee sara = new Employee("Sara", 45);
        Employee victor = new Employee("Victor", 40);
        Employee eva = new Employee("Eva", 42);

        List<Employee> employeeList = Arrays.asList(sara, victor, eva);

        Optional<Employee> maxEmploee = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge));

        Employee result = maxEmploee.orElse(new Employee("Denis", 1));

        System.out.println("maxEmploee = " + maxEmploee);

        System.out.println("maxEmploee = " + result.getName());

    }
}
