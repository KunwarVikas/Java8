package main.com.kv.java8.lambda;

import main.com.kv.java8.defaultmethod.Implementation2;

public class Implementation1 implements Interface1{
    @Override
    public void print(String str) {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Implementation1 impl = new Implementation1();
        Interface1 interface1 = (s)->{
            System.out.println(s);
            System.out.println(s);
        };
        interface1.print("Hello");
    }
}
