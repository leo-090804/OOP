package test2;
import test.*;

public class clm extends Person{
    int age;
    
    public clm(int age, String name){
        super(name);
        this.age = age;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
