package main.com.kv.java8.defaultmethod;

public interface Interface1 {
    void method1();

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    static void print() {
        System.out.println("print - in interface1");
    }

}
