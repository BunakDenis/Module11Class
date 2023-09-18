package main.global.goit.edu.module10;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

    private static List<String> emails = Arrays.asList("Denis@ukr.net", "Denis@gmail.com", "Uyriy@ukr.net", "Igor@i.ua");

    public static void main(String[] args) {

        //FUNCTION EXAMPLE
        Map<String, Integer> result = calculateEmailsLetters(emails, email -> email.length());

        System.out.println(result);

        //CONSUMER EXAMPLE
        Consumer<Map<String, Integer>> consumer = map -> {
            for (Map.Entry<String, Integer> entry: map.entrySet()){
                System.out.println("Email " + entry.getKey() + "have " + entry.getValue() + " letters.");
            }
        };
        consumer.accept(result);

        //SUPPLIER EXAMPLE
        Supplier<Integer> randomDigit = () -> new Random().nextInt(100) * 50;

        System.out.println("randomDigit.get() = " + randomDigit.get());
        System.out.println("randomDigit.get() = " + randomDigit.get());
        System.out.println("randomDigit.get() = " + randomDigit.get());
        System.out.println("randomDigit.get() = " + randomDigit.get());
        System.out.println("randomDigit.get() = " + randomDigit.get());


        //BINARY OPERATION
        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        System.out.println("multiply.apply(randomDigit.get(), randomDigit.get()) = " + multiply.apply(randomDigit.get(), randomDigit.get()));

        //UNARY


    }

    public static Map<String, Integer> calculateEmailsLetters(List<String> emails, Function<String, Integer> function) {
        Map<String, Integer> result = new HashMap<>();
        for (String email : emails) {
            result.put(email, function.apply(email));
        }
        return result;
    }

}
