package main.global.goit.edu.module10.StreamMerg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMeargeTest {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("Alpha", "Beta", "Gamma");
        Stream<String> stream2 = Stream.of("1", "2", "3", "4");

        Stream<String> result = zipIteration(stream1, stream2);

        result.peek(System.out::println).collect(Collectors.toList());
    }

    public static <T> Stream<T> zip(Stream<T> streamA, Stream<T> streamB) {

        List<T> stream1 = streamA.toList();
        List<T> stream2 = streamB.toList();

        List<T> result = new ArrayList<>();

        int listLength = (Math.min(stream1.size(), stream2.size()));

        for (int i = 0; i < listLength; i++) {
            result.add(stream1.get(i));
            result.add(stream2.get(i));
        }

        return result.stream();

    }

    public static <T> Stream <T> zipIteration (Stream<T> streamA, Stream<T> streamB) {
        List<T> resultList = new ArrayList<>();

        Iterator<T> iterator1 = streamA.iterator();
        Iterator<T> iterator2 = streamB.iterator();

        while (iterator1.hasNext() && iterator2.hasNext()) {
            resultList.add(iterator1.next());
            resultList.add(iterator2.next());
        }

        return resultList.stream();

    }

}