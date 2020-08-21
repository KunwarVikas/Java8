package main.com.kv.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {
    public static void main(String[] args) {
        //list
        Stream<Integer> intStream = Stream.of(1,2,3,4,5);
        List<Integer> intList = intStream.collect(Collectors.toList());
        System.out.println(intList); //prints [1, 2, 3, 4, 5]

        //map
        intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
        Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
        System.out.println(intMap);

        //array
        Stream<Integer> intStream1 = Stream.of(1,2,3,4);
        Integer[] intArray = intStream1.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray)); //prints [1, 2, 3, 4]

        //create a stream of lowercase strings and convert
        //them to uppercase using map and return a list.

        Stream<String> stream = Stream.of("hello", "kunwar", "vikas");
        List<String> collect = stream.map(s -> s.toUpperCase()).collect(Collectors.toList());
        collect.forEach(s-> System.out.println(s));

        //stream is closed as soon as operations has been finished.

        //sort and reverse sort
        Stream<String> stream1 = Stream.of("hello", "a", "kunwar", "b" ,"vikas","c");
        List<String> reverseSort = stream1.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        reverseSort.forEach(s-> System.out.println(s));
        Stream<String> stream2 = Stream.of("hello", "a", "kunwar", "b" ,"vikas","c");
        List<String> naturalSort = stream2.sorted().collect(Collectors.toList());
        naturalSort.forEach(s-> System.out.println(s));
    }
}
