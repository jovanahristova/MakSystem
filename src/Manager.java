public class Manager extends Employee{

    public Manager(String name, Level level, int salary) {
        super(name, level,salary);
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + 300;
    }
}
