package za.ac.cput.assingment4;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import  za.ac.cput.assingment4.Composition.PersonComposition;

/**
 * Created by student on 2015/02/27.
 */
public class PersonCompositionTest {


    @Test
    public void testPersonComposition() throws Exception {
        PersonComposition  person = new PersonComposition();
        Assert.assertEquals(25000,person.getSalary());


    }

    @After
    public void tearDown() throws Exception {


    }

    @Before
    public void setUp() throws Exception {

       PersonComposition  person = new PersonComposition();



    }
}
