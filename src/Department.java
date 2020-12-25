import java.util.ArrayList;
import java.util.List;

public abstract class Department implements IDepartment {
    public String departmentName;
    public List<Employee> employeeList;

    public Department(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    @Override
    public int getDepartmentSalary() {
       return employeeList.stream().mapToInt(employee -> employee.calculateSalary()).sum();
    }

    @Override
    public String printDepartmentName() {
        return departmentName;
    }

    @Override
    public int getNumberOfEmployees() {
        return employeeList.size();
    }
}
