package Week3_Student;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

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
    public String getId() {
        return id;
    }

    /**
     * javadoc.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * javadoc.
     */
    public String getGroup() {
        return group;
    }

    /**
     * javadoc.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * javadoc.
     */
    public String getEmail() {
        return email;
    }

    /**
     * javadoc.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * javadoc.
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /**
     * javadoc.
     */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * javadoc.
     */
    public Student(String newName, String newId, String newEmail) {
        name = newName;
        id = newId;
        email = newEmail;
        group = "K62CB";
    }

    /**
     * javadoc.
     */
    public Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
}

