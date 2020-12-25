public class HRDepartment extends Department {

    public HRDepartment() {
        departmentName = "HR";
    }

    @Override
    public int getDepartmentMonthlySalary() {
        return 300;
    }
}
