import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbAdmin;

    @Before
    public void setup() {
        dbAdmin = new DatabaseAdmin("Bill", "CD40506070LH", 26200);
    }

    @Test
    public void canGetName() {
        assertEquals("Bill", dbAdmin.getName());
    }

    @Test
    public void canSetName() {
        dbAdmin.setName("William");
        assertEquals("William", dbAdmin.getName());
    }

    @Test
    public void newNameCannotBeNull() {
        dbAdmin.setName(null);
        assertEquals("Bill", dbAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("CD40506070LH", dbAdmin.getNumberNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(26200, dbAdmin.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        dbAdmin.raiseSalary(1000);
        assertEquals(27200, dbAdmin.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(262, dbAdmin.payBonus(), 0.001);
    }

}
