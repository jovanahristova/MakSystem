public class Employee {

    public String name;
    public Level level;
    public int salary;

    public Employee(String name, Level level, int salary) {
        this.name = name;
        this.level = level;
        this.salary = salary;
    }

    public int calculateSalary(){
        return salary + level.getBonus();
    }

}
