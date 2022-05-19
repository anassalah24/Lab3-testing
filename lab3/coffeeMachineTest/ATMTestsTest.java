import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ATMTestsTest {

    @Test
    public void ATMStubtest(){

        ATM mytest = new ATM();
        assertEquals("Withdraw accepted,new balance is9000" , mytest.withdraw(1000));

    }
    @Test
    public void ATMStubImplementationtest(){

        ATM mytest = new ATM();
        assertEquals("insufficient balance" , mytest.withdraw(11000));

    }

}