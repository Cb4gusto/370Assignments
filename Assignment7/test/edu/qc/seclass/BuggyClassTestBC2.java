package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestBC2 {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testBuggyMethod2_3() throws Exception {
        BuggyClass bc = new BuggyClass();
        int x = bc.buggyMethod2(3, 1);
        assertEquals(4, x);
    }

    @Test
    public void testBuggyMethod2_4() throws Exception {
        BuggyClass bc = new BuggyClass();
        bc.buggyMethod2(5, 0);
    }

}