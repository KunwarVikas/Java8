package main.com.kv.java8.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        Stream<Integer> seqStream = myList.stream();
        Stream<Integer> parStream = myList.parallelStream();

        Stream<Integer> seqStreamResult = seqStream.filter(p -> p > 90);
        seqStreamResult.forEach(p-> System.out.println(p));

        Stream<Integer> parStreamResult = parStream.filter(p -> p > 50);
        parStreamResult.forEach(p-> System.out.println(p));
    }
}
