package staff.management;

public class Director extends Manager {

    double budget;

    public Director(String name, String numberNI, double salary, String deptName, double budget) {
        super(name, numberNI, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus() {
        return (this.getSalary() / 50);
    }

}
