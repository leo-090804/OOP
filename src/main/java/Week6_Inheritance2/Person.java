package Week6_Inheritance2;

public class Person {
    private String name;
    private String address;

    /**
     * javadoc.
     */
    public Person() {
        name = "name";
        address = "address";
    }

    /**
     * javadoc.
     */
    public Person(String newName, String newAddress) {
        name = newName;
        address = newAddress;
    }

    /**
     * javadoc.
     */
    public String getName() {
        return name;
    }

    /**
     * javadoc.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * javadoc.
     */
    public String getAddress() {
        return address;
    }

    /**
     * javadoc.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * javadoc.
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
