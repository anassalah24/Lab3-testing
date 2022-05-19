import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalWatchTestTest {


    @Test
    public void checkStubs(){
        DigitalWatch mytest = new DigitalWatch();
        assertEquals("Time is : " + "Hours : " + 0 + " " + "Minutes : " + 0 + " " + "Seconds : " + 1 , mytest.incrementSeconds());
    }


    @Test
    public void check60second(){
        DigitalWatch mytest = new DigitalWatch();
        for (int i = 0; i < 59; i++) {
            mytest.incrementSeconds();

        }


        assertEquals("Time is : " + "Hours : " + 0 + " " + "Minutes : " + 1 + " " + "Seconds : " + 0 , mytest.incrementSeconds());
    }

    @Test
    public void check60MINUTES(){
        DigitalWatch mytest = new DigitalWatch();
        for (int i = 0; i < 3599; i++) {
            mytest.incrementSeconds();

        }


        assertEquals("Time is : " + "Hours : " + 1 + " " + "Minutes : " + 0 + " " + "Seconds : " + 0 , mytest.incrementSeconds());
    }

    @Test
    public void check24hours(){
        DigitalWatch mytest = new DigitalWatch();
        for (int i = 0; i < 86399; i++) {
            mytest.incrementSeconds();

        }


        assertEquals("Time is : " + "Hours : " + 0 + " " + "Minutes : " + 0 + " " + "Seconds : " + 0 , mytest.incrementSeconds());
    }
}