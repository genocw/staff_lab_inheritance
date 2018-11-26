package staff;

public abstract class Employee {

    private String name;
    private String numberNI;
    private double salary;

    public Employee(String name, String numberNI, double salary) {
        this.name = name;
        this.numberNI = numberNI;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        if (newName != null) {
            this.name = newName;
        }
    }

    public String getNumberNI() {
        return this.numberNI;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double addAmount) {
        if (addAmount > 0) {
            this.salary += addAmount;
        }
    }

    public double payBonus() {
        return (this.salary / 100);
    }
}
