package main.global.goit.edu.module10.Human;

import java.util.Objects;

public class Human {

    final private String name;
    final private int salary;

    public Human(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
