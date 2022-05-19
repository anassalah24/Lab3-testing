public class CoffeeMachine {

//    function which lets user order coffee
    public String orderCoffee(String type){

        // call stub to check if type is available
        coffeeMachineStub mystub  = new coffeeMachineStub();
        String check = mystub.checkAvailabilityStub(type);
        if (check == "Available"){
            return "COFFEE IS BEING PREPARED...";
        }
        else {
            return "COFFEE NOT AVAILABLE";
        }


    }

}
