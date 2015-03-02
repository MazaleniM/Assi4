package za.ac.cput.assingment4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/26.
 */
public class EmployeePolyTest {
    @Test
    public void testPolyMophic() throws Exception {
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        Employee employee = new CommissionEmployee("Masimphiwe","Mazaleni",300560,75000,1500);


    }

    @Before
    public void setUp() throws Exception {
        CommissionEmployee commissionEmployee = new CommissionEmployee();
       Employee employee = new CommissionEmployee();


    }

    @After
    public void tearDown() throws Exception {


    }
}
