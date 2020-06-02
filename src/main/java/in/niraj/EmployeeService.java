package in.niraj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {

    private static  Map<String, List<Employee>> map;

    // Instantiating the static map
    static
    {
        map = new HashMap<>();
        map.put("1", populateFirstList());
        map.put("2", populateSecondList());
        map.put("5", populateThirdList());
        map.put("10", populateFourthList());
        map.put("3", populateFifthList());
        map.put("16", populateSixthList());
        map.put("4", populateSeventhList());
    }

    private static List<Employee> populateFirstList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("2","Venita","Ibbeson");
        Employee employee2 = new Employee("3","Elvira","Roycroft");
        Employee employee3 = new Employee("4","Rosmunda","Blune");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }

    private static List<Employee> populateSecondList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("5","Benson","Tomsen");
        Employee employee2 = new Employee("6","Dennie","Marcq");
        Employee employee3 = new Employee("7","Gregoor","Almey");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }
    private static List<Employee> populateThirdList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("8","Sara","Echallier");
        Employee employee2 = new Employee("9","Emili","Waber");
        Employee employee3 = new Employee("10","Rabi","Dybald");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }

    private static List<Employee> populateFourthList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("11","Frederico","Deighan");
        Employee employee2 = new Employee("12","Lin","Weatherall");
        Employee employee3 = new Employee("13","Dian","Caldwell");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }

    private static List<Employee> populateFifthList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("14","Stormy","McPaik");
        Employee employee2 = new Employee("15","Steffane","Figge");
        Employee employee3 = new Employee("16","Dyna","Gatchell");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }

    private static List<Employee> populateSixthList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("17","Tessa","Casbolt");
        Employee employee2 = new Employee("18","Nerti","Cale");
        Employee employee3 = new Employee("19","Orly","Stobbes");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }


    private static List<Employee> populateSeventhList() {
        List<Employee> firstEmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("20","Elka","Gourley");
        Employee employee2 = new Employee("21","Celisse","Lopez");
        Employee employee3 = new Employee("22","Trever","Pauling");
        firstEmployeeList.add(employee1);
        firstEmployeeList.add(employee2);
        firstEmployeeList.add(employee3);
        return firstEmployeeList;
    }





    public List<Employee> getEmployee(String vzeId){
        return map.get(vzeId);
    }
}
