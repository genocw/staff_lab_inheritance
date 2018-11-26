package staff.management;

import staff.Employee;

public class Manager extends Employee {

    String deptName;

    public Manager(String name, String numberNI, double salary, String deptName) {
        super(name, numberNI, salary);
        this.deptName = deptName;
    }

}
