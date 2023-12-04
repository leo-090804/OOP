package Week8_Abstract_Revision;

public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * @param newBrand
     * @param newModel
     * @param registrationNumber
     * @param newOwner
     * @param doorQuantity
     */
    public Car(String newBrand, String newModel, String registrationNumber,
               Person newOwner, int doorQuantity) {
        super(newBrand, newModel, registrationNumber, newOwner);
        numberOfDoors = doorQuantity;
    }

    /**
     * javadoc.
     */
    @Override
    public String getInfo() {
        StringBuilder carInfo = new StringBuilder("Car:\n"
                + "\tBrand: " + getBrand() + "\n"
                + "\tModel: " + getModel() + "\n"
                + "\tRegistration Number: " + getRegistrationNumber() + "\n"
                + "\tNumber of Doors: " + getNumberOfDoors() + "\n"
                + "\tBelongs to " + getOwner().getName() + " - " + getOwner().getAddress());
        return carInfo.toString();
    }

    /**
     * javadoc.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * javadoc.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
