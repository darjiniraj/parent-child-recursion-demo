package in.niraj;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static EmployeeService employeeService = new EmployeeService();

    public static void main(String[] args) throws JsonProcessingException {

        List<EmployeeTree> gatherListParent = new ArrayList<>();
        Collection<Employee> employeeList = employeeService.getEmployee("1");
        List<EmployeeTree> recursiveEmployeeFromParent = getRecursiveEmployeeFromParent(employeeList, gatherListParent);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String arrayToJson = objectMapper.writeValueAsString(recursiveEmployeeFromParent);
        System.out.println(arrayToJson);

    }

    //GatherEntity - Employee
    private static List<EmployeeTree> getRecursiveEmployeeFromParent(Collection<Employee> sourceEmployeeList, List<EmployeeTree> employeeTreeListParent) {

        if (sourceEmployeeList != null && sourceEmployeeList.size() > 0) {
            for (Iterator<Employee> iterator = sourceEmployeeList.iterator(); iterator.hasNext(); ) {
                Employee employee = iterator.next();
                EmployeeTree employeeTree = getEmployeeTreeFromEntity(employee);
                Collection<Employee> childEmployeeList = getEmployeeListByChildId(employee.getId());

                List<EmployeeTree> childEmployeeTreeList = new ArrayList<>();

                if (null != childEmployeeList && childEmployeeList.size() > 0) {
                    childEmployeeTreeList = childEmployeeList.stream().map(Main::getEmployeeTreeFromEntity).collect(Collectors.toList());
                }

                employeeTree.setChildren(childEmployeeTreeList);
                employeeTreeListParent.add(employeeTree);


            }
        }
        return employeeTreeListParent;
    }

    private static EmployeeTree getEmployeeTreeFromEntity(Employee employee) {
        EmployeeTree employeeTree = new EmployeeTree();
        employeeTree.setId(employee.getId());
        employeeTree.setCommonName(employee.getCommonName());
        employeeTree.setFirstName(employee.getFirstName());
        List<Employee> employeeListByChildId = getEmployeeListByChildId(employeeTree.getId());
        List<EmployeeTree> childEmployeeTreeList = new ArrayList<>();

        if (null != employeeListByChildId && employeeListByChildId.size() > 0) {
            childEmployeeTreeList = employeeListByChildId.stream().map(Main::getEmployeeTreeFromEntity).collect(Collectors.toList());
        }

        employeeTree.setChildren(childEmployeeTreeList);

        return employeeTree;
    }

    private static List<Employee> getEmployeeListByChildId(String id) {
        return employeeService.getEmployee(id);
    }


}
