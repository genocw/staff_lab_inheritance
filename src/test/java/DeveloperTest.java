import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setup() {
        developer = new Developer("Ria", "CD2000300GB", 28000);
    }

    @Test
    public void canGetName() {
        assertEquals("Ria", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("CD2000300GB", developer.getNumberNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(28000, developer.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2000);
        assertEquals(30000, developer.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(280, developer.payBonus(), 0.001);
    }

}
