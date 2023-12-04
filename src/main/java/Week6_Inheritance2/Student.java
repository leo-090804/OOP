package Week6_Inheritance2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * javadoc.
     */
    public Student() {
        program = "program_name";
        year = 1;
        fee = 1.0;
    }

    /**
     * javadoc.
     */
    public Student(String name, String address, String newProgram, int newYear, double newFee) {
        super(name, address);
        program = newProgram;
        year = newYear;
        fee = newFee;
    }

    /**
     * javadoc.
     */
    public String getProgram() {
        return program;
    }

    /**
     * javadoc.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * javadoc.
     */
    public int getYear() {
        return year;
    }

    /**
     * javadoc.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * javadoc.
     */
    public double getFee() {
        return fee;
    }

    /**
     * javadoc.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * javadoc.
     */
    @Override
    public String toString() {
        String person = super.toString();
        String strYear = String.valueOf(year);
        String strFee = String.valueOf(fee);
        return "Student[" + person + ",program=" + program + ",year=" + strYear + ",fee=" + strFee + "]";
    }
}
