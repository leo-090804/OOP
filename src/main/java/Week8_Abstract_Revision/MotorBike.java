package Week8_Abstract_Revision;

public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike(String newBrand, String newModel, String registrationNumber,
                     Person newOwner, boolean hasSidecar) {
        super(newBrand, newModel, registrationNumber, newOwner);
        this.hasSidecar = hasSidecar;
    }

    public boolean ishasSidecar() {
        return hasSidecar;
    }

    public void sethasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        StringBuilder motorInfo = new StringBuilder("Motor Bike:\n"
                + "\tBrand: " + getBrand() + "\n"
                + "\tModel: " + getModel() + "\n"
                + "\tRegistration Number: " + getRegistrationNumber() + "\n"
                + "\tHas Side Car " + ishasSidecar() + "\n"
                + "\tBelongs to " + getOwner().getName() + " - " + getOwner().getAddress());
        return motorInfo.toString();
    }
}
