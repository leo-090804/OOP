package test;

public class HelloTestDrive {
    public static void main(String[] args) {
        Hello.sayHello();
        System.out.println(Hello.message);
        Hello h = new Hello();
        h.sayHello();
        h.sayHello("Hello, world");
    }
}
