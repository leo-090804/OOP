package test;

public final class Hello {
    public static String message = "Hello, world";
    private int cnt = 0;

    public static void sayHello() {
        System.out.println(message);
    }

    public void sayHello(String msg) {
        System.out.println(msg);
    }

    public void sayHi(){
        System.out.println("hi");
    }
}

