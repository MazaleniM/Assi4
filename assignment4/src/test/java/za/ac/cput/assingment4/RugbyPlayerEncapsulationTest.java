package za.ac.cput.assingment4;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/26.
 */
public class RugbyPlayerEncapsulationTest {
    @Before
    public void setUp() throws Exception {
        RugbyPlayerEncapsulation player = new RugbyPlayerEncapsulation("Schalk","Burger",9,475000);



    }

    @Test
    public void testGetJerseyNumber() throws Exception {
        RugbyPlayerEncapsulation player1 = new RugbyPlayerEncapsulation();
        player1.setName("Percy");
        player1.setJerseyNumber(16);


        Assert.assertEquals(player1.getJerseyNumber(),2);
        Assert.assertEquals(player1.getName(),"Victor");

    }

    @After
    public void tearDown() throws Exception {


    }
}
