package Week8_Abstract_Revision;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    public Vehicle(String newBrand, String newModel, String registrationNumber, Person newOwner) {
        brand = newBrand;
        model = newModel;
        this.registrationNumber = registrationNumber;
        owner = newOwner;
    }

    public abstract String getInfo();

    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
