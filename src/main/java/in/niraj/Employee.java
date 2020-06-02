package in.niraj;

public class Employee {
    private String id;
    private String commonName;
    private String firstName;

    public Employee(String id, String commonName, String firstName) {
        this.id = id;
        this.commonName = commonName;
        this.firstName = firstName;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", commonName='" + commonName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
