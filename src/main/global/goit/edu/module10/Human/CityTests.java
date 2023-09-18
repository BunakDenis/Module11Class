package main.global.goit.edu.module10.Human;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CityTests {

    public static void main(String[] args) {
        City kiev = new City("Kyiv", 400000);
        City lviv = new City("Lviv", 200000);
        City vinnitsiy = new City("Vinnitsiy", 100000);

        Map<String, Integer> cityPopulation = Stream.of(kiev, vinnitsiy, lviv)
                .collect(Collectors.toMap(City::getName, City::getPopulation));
        
        System.out.println("cityPopulation = " + cityPopulation);

        int sumOfPopulation = cityPopulation
                .values()
                .stream()
                .mapToInt(it -> it)
                .sum();

        System.out.println("sumOfPopulation = " + sumOfPopulation);

    }
}