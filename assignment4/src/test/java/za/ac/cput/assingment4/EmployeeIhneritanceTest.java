package za.ac.cput.assingment4;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by student on 2015/02/26.
 */
public class EmployeeIhneritanceTest {

    @Before
    public void setUp() throws Exception {
        //CommissionEmployee commissionEmployee = new CommissionEmployee();
        EmployeeInheritance employee = new CommissionEmployeeInheritance();

    }

    @Test
    public void testEmployeeInheritanceGetName() throws Exception {
        EmployeeInheritance employee = new CommissionEmployeeInheritance("Masimphiwe","Mazaleni",300560,75000,1500);

        Assert.assertEquals(employee.getName(),"Sanborn");

    }

    @After
    public void tearDown() throws Exception {


    }
}
