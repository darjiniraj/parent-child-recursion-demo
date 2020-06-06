package in.niraj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {

    private static Map<String, List<Employee>> map;

    // Instantiating the static map
    static {
        map = new HashMap<>();
        map.put("1", populateFirstList());
        map.put("2", populateSecondList());
        map.put("5", populateThirdList());
        map.put("10", populateFourthList());
        map.put("3", populateFifthList());
        map.put("16", populateSixthList());
        map.put("4", populateSeventhList());
        map.put("11", populateEightList());
    }

    private static List<Employee> populateFirstList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("2", "Venita", "Ibbeson","Manager");
        Employee employee2 = new Employee("3", "Elvira", "Roycroft","Manager");
        Employee employee3 = new Employee("4", "Rosmunda", "Blune","Manager");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }

    private static List<Employee> populateSecondList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("5", "Benson", "Tomsen","Tech Lead");
        Employee employee2 = new Employee("6", "Dennie", "Marcq","Tech Lead");
        Employee employee3 = new Employee("7", "Gregoor", "Almey","Tech Lead");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }

    private static List<Employee> populateThirdList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("8", "Sara", "Echallier","Sr.Dev");
        Employee employee2 = new Employee("9", "Emili", "Waber","Sr.Dev");
        Employee employee3 = new Employee("10", "Rabi", "Dybald","Sr.Dev");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }

    private static List<Employee> populateFourthList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("11", "Frederico", "Deighan","Jr.Dev");
        Employee employee2 = new Employee("12", "Lin", "Weatherall","Jr.Dev");
        Employee employee3 = new Employee("13", "Dian", "Caldwell","Jr.Dev");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }

    private static List<Employee> populateFifthList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("14", "Stormy", "McPaik","Tech Lead");
        Employee employee2 = new Employee("15", "Steffane", "Figge","Tech Lead");
        Employee employee3 = new Employee("16", "Dyna", "Gatchell","Tech Lead");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }

    private static List<Employee> populateSixthList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("17", "Tessa", "Casbolt","Sr.Dev");
        Employee employee2 = new Employee("18", "Nerti", "Cale","Sr.Dev");
        Employee employee3 = new Employee("19", "Orly", "Stobbes","Sr.Dev");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }


    private static List<Employee> populateSeventhList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("20", "Elka", "Gourley","Tech Lead");
        Employee employee2 = new Employee("21", "Celisse", "Lopez","Tech Lead");
        Employee employee3 = new Employee("22", "Trever", "Pauling","Tech Lead");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }

    private static List<Employee> populateEightList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("23", "CName", "Fname","Trainee");
        Employee employee2 = new Employee("24", "CName1", "Fname1","Trainee");
        Employee employee3 = new Employee("25", "CName2", "Fname2","Trainee");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }


    public List<Employee> getEmployee(String vzeId) {
        return map.get(vzeId);
    }
}
