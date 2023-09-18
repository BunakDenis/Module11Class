package main.global.goit.edu.module10.StreamExesises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {

    public static void main(String[] args) {

        Employee sara = new Employee("Sara", 15, "Norwegian");
        Employee victor = new Employee("Victor", 20, "Ukrainian");
        Employee eva = new Employee("Eva", 18, "Poland");
        Employee denis = new Employee("Denis", 33, "Ukrainian");

        List<Employee> employees = Arrays.asList(sara, victor, eva, denis);

        List<Employee> ukrainianEmployees = employees.stream()
                .filter(employee -> employee.getNationality().equals("Ukrainian"))
                .toList();

        List<Employee> polandEmployees = employees.stream()
                .filter(employee -> employee.getNationality().equals("Poland"))
                .toList();

        System.out.println("polandEmployees = " + polandEmployees);

        System.out.println("ukrainianEmployees = " + ukrainianEmployees);


        Map<String, List<Employee>> collectOfEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getNationality));

        System.out.println("collectOfEmployees = " + collectOfEmployees);

    }

}
