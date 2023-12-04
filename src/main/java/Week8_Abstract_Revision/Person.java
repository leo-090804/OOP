package Week8_Abstract_Revision;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String newName, String newAddress) {
        name = newName;
        address = newAddress;
    }

    public void addVehicle(Vehicle newVehicle) {
        vehicleList.add(newVehicle);
    }

    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicle);
                break;
            }
        }
    }

    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        } else {
            StringBuilder result = new StringBuilder(name + " has:\n\n");
            for (Vehicle vehicle : vehicleList) {
                result.append(vehicle.getInfo()).append("\n");
            }
            return result.toString();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
