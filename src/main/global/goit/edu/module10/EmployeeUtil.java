package main.global.goit.edu.module10;

public class EmployeeUtil {
    public static void printEmployee (Employee employee) {
        System.out.println("Employee identifier " + employee.getId());
        System.out.println("Employee name " + employee.getName());
    }
    public void printName (String employee) {
        System.out.println("Employee name " + employee);
    }
}