package Week6_Inheritance2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Leo", "Vinhomes", "IS", 2022, 17.5000000);
        Staff staff = new Staff("Leo", "Vinhomes", "UET", 17.5000000);
        String opt1 = student.toString();
        String opt2 = staff.toString();
        System.out.println(opt1);
        System.out.println(opt2);
    }
}

