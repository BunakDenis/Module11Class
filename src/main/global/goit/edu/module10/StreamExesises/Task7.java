package main.global.goit.edu.module10.StreamExesises;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task7 {

    public static void main(String[] args) {

        Employee sara = new Employee("Sara", 15);
        Employee victor = new Employee("Victor", 20);
        Employee eva = new Employee("Eva", 18);
        Employee denis = new Employee("Denis", 33);

        List<Employee> employees = Arrays.asList(sara, victor, eva, denis);

        final IntSummaryStatistics statisticOfEmployees = employees.stream()
                .mapToInt(Employee::getAge)
                .summaryStatistics();

        double average = statisticOfEmployees.getAverage();
        long sum = statisticOfEmployees.getSum();
        int max = statisticOfEmployees.getMax();
        int min = statisticOfEmployees.getMin();
        long count = statisticOfEmployees.getCount();

        System.out.println("average = " + average);
        System.out.println("sum = " + sum);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("count = " + count);

    }


}
