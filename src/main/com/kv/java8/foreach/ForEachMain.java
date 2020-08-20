package main.com.kv.java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for(int i=0;i<10;i++){
            myList.add(i);
        }

        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}
