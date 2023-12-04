package Week8_Abstract_Revision;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Leo", "Ha Noi");
        Person p2 = new Person("An", "Hai Phong");
        Person p3 = new Person("delbiet", "vogiacu");

        Vehicle v1 = new Car("Mercedes", "abc", "15A - 88.888", p1, 4);
        Vehicle v2 = new Car("Range Rover", "xyz", "15A - 66.666", p2, 4);

        p1.addVehicle(v1);
        p1.addVehicle(v2);
        p2.addVehicle(v2);

        System.out.println(p1.getVehiclesInfo());
        System.out.println(p2.getVehiclesInfo());

        p1.removeVehicle(v1.getRegistrationNumber());
        System.out.println(p1.getVehiclesInfo());
        System.out.println(p3.getVehiclesInfo());
    }
}
