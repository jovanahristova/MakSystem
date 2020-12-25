import java.util.ArrayList;
import java.util.List;

public class Company {

    public String companyName;
    public List<Department> departmentList;

    public Company() {
        this.departmentList = new ArrayList<>();
    }

    public Company(String companyName){
        this.companyName = companyName;
    }

    public void addDepartment(Department department){
        departmentList.add(department);
    }
}
