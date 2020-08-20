package main.com.kv.java8.defaultmethod;

public class Implementation implements Interface1, Interface2 {
    @Override
    public void method1() {

    }

    @Override
    public void log(String str) {
        System.out.println("Impl1: "+str);
        Interface1.print();
    }


    @Override
    public void method2() {
    }

    public static void main(String[] args) {
        Interface1 impl = new Implementation();
        impl.log("hello dear");
    }

}
