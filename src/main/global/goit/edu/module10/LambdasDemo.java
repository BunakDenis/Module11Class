package main.global.goit.edu.module10;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdasDemo {

    private static List<String> emails = Arrays.asList("Denis@ukr.net", "Denis@gmail.com", "Uyriy@ukr.net", "Igor@i.ua");

    public static void main(String[] args) {
        //WITH LYAMBDA EXPRESSION
        checkEmail(emails, email -> email.contains("gmail.com"));
        Collections.sort(emails, (String o1, String o2) -> (o1.length() - o2.length()));
        System.out.println(emails);

        Function<Integer, Double> function = value -> value * 0.2;
        System.out.println(function.apply(100));

    }

    private static List<String> checkEmail(List<String> emails, Predicate<String> function) {
        List<String> result = new ArrayList<>();
        for (String email : emails) {
            if (function.test(email)) {
                result.add(email);
            }
        }
        return result;
    }
}
