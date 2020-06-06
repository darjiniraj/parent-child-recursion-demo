package in.niraj;

public class Employee {
    private String id;
    private String commonName;
    private String firstName;
    private String designation;

    public Employee(String id, String commonName, String firstName, String designation) {
        this.id = id;
        this.commonName = commonName;
        this.firstName = firstName;
        this.designation = designation;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", commonName='" + commonName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
