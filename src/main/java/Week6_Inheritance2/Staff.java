package Week6_Inheritance2;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * javadoc.
     */
    public Staff() {
        school = "school_name";
        pay = 1.0;
    }

    /**
     * javadoc.
     */
    public Staff(String newName, String newAddress, String newSchool, double newPay) {
        super(newName, newAddress);
        school = newSchool;
        pay = newPay;
    }

    /**
     * javadoc.
     */
    public String getSchool() {
        return school;
    }

    /**
     * javadoc.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * javadoc.
     */
    public double getPay() {
        return pay;
    }

    /**
     * javadoc.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * javadoc.
     */
    @Override
    public String toString() {
        String person = super.toString();
        String strPay = String.valueOf(pay);
        return "Staff[" + person + ",school=" + school + ",pay=" + strPay + "]";
    }
}
