package main.com.kv.java8.defaultmethod;

public class Implementation2 implements Interface1{
    @Override
    public void method1() {

    }

    public static void main(String[] args) {
        Implementation2 impl = new Implementation2();
        impl.log("for interface");
    }
}
