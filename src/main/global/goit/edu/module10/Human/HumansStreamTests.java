package main.global.goit.edu.module10.Human;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class HumansStreamTests {

    public static void main(String[] args) {
        HumanGeneration generation = new HumanGeneration();

/*        List<Human> highSalaryFilter = generation.generation(100)
                .stream()
                .filter(human -> human.getSalary() > 1000)
                .filter(human -> human.getSalary() < 1100)
                .peek(human -> {
                    System.out.println("human = " + human);
                })
                .toList();


        System.out.println("highSalaryFilter.size() = " + highSalaryFilter.size());
        System.out.println("filterHuman = " + highSalaryFilter);
*/


/*        List<Human> humans = generation
                .generation(100)
                .stream()
                .distinct()
                .peek(human -> System.out.println("Human: " + human))
                .toList();

        System.out.println("humans.size() = " + humans.size());*/

/*
        List<Human> sorted = generation
                .generation(20)
                .stream()
                .filter(human -> human.getSalary() > 1000)
                .distinct()
                .sorted((h1, h2) -> h1.getSalary() - h2.getSalary())
                .peek(System.out::println)
                .toList();
*/

/*        List<Human> withMaxSalary = generation
                .generation(10);

        System.out.println(withMaxSalary);

        List<String> numaratingList = withMaxSalary
                .stream()
                .map(human -> {
                    int count = 1;
                    return count + "." + human.getName();
                })
                .skip(1)
                .limit(1)
                .peek(System.out::println)
                .toList();*/

/*        generation
                .generation(50)
                .stream()
                .map(human -> {
                    String[] nameParts = human.getName().split(" ");
                    String newName = nameParts[0].toUpperCase() + " " + nameParts[1].toLowerCase();
                    return (new Human(newName, human.getSalary()));
                })
                .sorted((h1, h2) -> h1.getSalary() - h2.getSalary())
                .map(human -> human.getName() + " :" + human.getSalary())
                .filter(it -> it.toLowerCase().contains("a"))
                .filter(it -> it.charAt(it.length() - 1) == '2')
                .peek(System.out::println)
                .collect(Collectors.toList());*/

/*        AtomicInteger order = new AtomicInteger(1);


        List<String> collect = generation
                .generation(20)
                .stream()
                .map(Human::getName)
                .map(name -> order.getAndIncrement() + ". " + name)
                .toList();

        System.out.println("count = " + collect);*/


        List<String> collect = generation
                .generation(10)
                .stream()
                .peek(System.out::println)
                .map(human -> human.getName())
                .filter(h -> h.toLowerCase().contains("m"))
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);


    }
}