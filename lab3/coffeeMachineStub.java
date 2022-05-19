import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coffeeMachineStub {


    String[] Available = new String[]{"American" , "Black" , "Turkish"};
    List<String> Availablelist = new ArrayList<>(Arrays.asList(Available));
    // check for coffee type availability
    public String checkAvailabilityStub(String type){

       if (Availablelist.contains(type)){
        return "Available";
       }
       else{
           return "Not Available";
       }
    }
}
