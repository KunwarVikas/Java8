package main.com.kv.java8.foreach;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer i) {
        System.out.println("This is value: "+i);
    }
}
