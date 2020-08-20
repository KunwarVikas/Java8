package main.com.kv.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(1,2,3,4,5);
        List<Integer> intList = intStream.collect(Collectors.toList());
        System.out.println(intList); //prints [1, 2, 3, 4, 5]

        intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
        Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
        System.out.println(intMap);

        Stream<Integer> intStream1 = Stream.of(1,2,3,4);
        Integer[] intArray = intStream1.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray)); //prints [1, 2, 3, 4]


    }
}
