public class ATMStub {

    public int balance = 10000;

    public String checkbalance(int requested){

        if (requested <= balance){
            return "Accepted";

        }
        else{
            return "Insufficient Balance";
        }


    }
}
