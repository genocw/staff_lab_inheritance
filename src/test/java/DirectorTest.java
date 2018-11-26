import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup() {
        director = new Director("Sophie", "HW123456GH", 41000, "Sales", 750000);
    }

    @Test
    public void canGetName() {
        assertEquals("Sophie", director.getName());
    }

    @Test
    public void canSetName() {
        director.setName("Sophia");
        assertEquals("Sophia", director.getName());
    }

    @Test
    public void newNameCannotBeNull() {
        director.setName(null);
        assertEquals("Sophie", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("HW123456GH", director.getNumberNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(41000, director.getSalary(), 0.001);
    }

    @Test
    public void canGetDeptNAme() {
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(750000, director.getBudget(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(4000);
        assertEquals(45000, director.getSalary(), 0.001);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        director.raiseSalary(-1000);
        assertEquals(41000, director.getSalary(), 0.001);
    }

    @Test
    public void canPayHigherBonus() {
        assertEquals(820, director.payBonus(), 0.001);
    }

}
