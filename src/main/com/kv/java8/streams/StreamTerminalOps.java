package main.com.kv.java8.streams;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * reduce()
 * count()
 * match()
 * findFirst()
 * anyMatch ()
 * allMatch()
 * noneMatch()
 */
public class StreamTerminalOps {
    public static void main(String[] args) {
        //reduce
        // We can use reduce() to perform a reduction on the elements of the stream,
        // using an associative accumulation function,
        // and return an Optional. Let’s see how we can use it multiply the integers in a stream.
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Optional<Integer> reduce = numbers.reduce((i, j) -> {
            return i * j;
        });
        if(reduce.isPresent()){
            System.out.println(reduce.get());
        }

        //count
        Stream<Integer> numbers1 = Stream.of(1,2,3,4,5);
        long count = numbers1.count();
        System.out.println(count);

        //anyMatch, allMatch, noneMatch
        Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains 4? "+numbers3.anyMatch(i -> i==4));
        //Stream contains 4? true

        Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains all elements less than 10? "+numbers4.allMatch(i -> i<10));
        //Stream contains all elements less than 10? true

        Stream<Integer> numbers5 = Stream.of(1,2,3,4,5);
        System.out.println("Stream doesn't contain 10? "+ numbers5.noneMatch(i -> i==10));
        //Stream doesn't contain 10? true

        //circuiting terminal ops
        Stream<String> names4 = Stream.of("amit","ajit","David", "Lisa");
        Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
        if(firstNameWithD.isPresent()){
            System.out.println("First Name starting with D="+firstNameWithD.get()); //David
        }


    }
}
