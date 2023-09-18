package main.global.goit.edu.module10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReference {

    private static List<Employee> employees = new ArrayList<>();

    {
        employees.add(new Employee(12, "Bogdan"));
        employees.add(new Employee(15, "Misha"));
        employees.add(new Employee(20, "Sergey"));
        employees.add(new Employee(25, "Dima"));
        employees.add(new Employee(27, "Denis"));
        employees.add(new Employee(30, "Anton"));
    }

    public static void main(String[] args) {
        //Static method
        Consumer<Employee> printEmployee = employee -> EmployeeUtil.printEmployee(employee);

        Consumer<Employee> printEmployeeWithReference = EmployeeUtil::printEmployee;

        printEmployeeWithReference.accept(new Employee(1, "Oleksandr"));

        //Not static method

        EmployeeUtil employeeUtil = new EmployeeUtil();

        Consumer<String> printName = name -> employeeUtil.printName(name);

        //with method reference
        Consumer<String> printNameWithReference = employeeUtil::printName;
        printNameWithReference.accept("Taras");

        //with non static method without class instance
        BiConsumer<EmployeeUtil, String> printName1 = (employee, name) -> employee.printName(name);
        BiConsumer<EmployeeUtil, String> printNameWithReference1 = EmployeeUtil::printName;
        printNameWithReference1.accept(new EmployeeUtil(), "Oleksandr");

        //constructor create instance
        final Supplier<Employee> getEmployee = () -> new Employee();

        Supplier<Employee> getEmployeeWithReference = Employee::new;

    }

}