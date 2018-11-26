import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup() {
        manager = new Manager("Suzi", "CD40030L", 24500, "Human Resources");
    }

    @Test
    public void canGetName() {
        assertEquals("Suzi", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("CD40030L", manager.getNumberNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(24500, manager.getSalary(), 0.001);
    }

    @Test
    public void canGetDeptNAme() {
        assertEquals("Human Resources", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(25500, manager.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(245, manager.payBonus(), 0.001);
    }

}
