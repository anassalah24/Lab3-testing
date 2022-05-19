
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class coffeeMachineTestTest {

    @Test
    public void coffeeStubTest(){
        CoffeeMachine teststub = new CoffeeMachine();
        assertEquals("COFFEE IS BEING PREPARED...",teststub.orderCoffee("American"));
    }

    @Test
    public void coffeeStubImplementationTest(){
        CoffeeMachine teststub = new CoffeeMachine();
        assertEquals("COFFEE NOT AVAILABLE",teststub.orderCoffee("Egyptian"));
    }

}