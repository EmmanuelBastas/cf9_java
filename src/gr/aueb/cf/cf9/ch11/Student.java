package gr.aueb.cf.cf9.ch11;

/**
 * Java Bean.
 * Is a data class that haves
 *  - private fields
 *  - Default Constructor
 *  - getters & setters following conventions
 */
public class Student {
    private static int studentsCount;

    // static block
    static {
        studentsCount = 0;
    }

    private int id;
    private String firstName;
    private String lastName;

    // Default Constructor
    public Student() {
        studentsCount++;
    }

    // Overloaded constructor
    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        studentsCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }
}
