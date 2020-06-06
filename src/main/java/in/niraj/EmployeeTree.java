package in.niraj;

import java.util.List;

public class EmployeeTree {
    private String id;
    private String commonName;
    private String firstName;
    private String designation;
    private List<EmployeeTree> children;

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

    public List<EmployeeTree> getChildren() {
        return children;
    }

    public void setChildren(List<EmployeeTree> children) {
        this.children = children;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "EmployeeTree{" +
                "id='" + id + '\'' +
                ", commonName='" + commonName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", children=" + children +
                '}';
    }
}
