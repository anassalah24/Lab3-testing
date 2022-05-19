public class ATM {



//    function that lets the user withdraw money
    public String withdraw(int requested){

        // call stub to check if requested amount is available in balance
        ATMStub mystub  = new ATMStub();
        String acceptance = mystub.checkbalance(requested);
        if (acceptance == "Accepted"){
            int newbalance = mystub.balance - requested;
            mystub.balance = mystub.balance - requested;
            return "Withdraw accepted,new balance is" + newbalance;
        }
        else{
            return "insufficient balance";
        }


    }
}
