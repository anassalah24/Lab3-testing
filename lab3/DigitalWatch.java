public class DigitalWatch {

    public int seconds = 0 ;
    public int minutes = 0 ;
    public int hours = 0 ;

    public String incrementSeconds(){

        seconds = seconds + 1;
        // call stub to check if seconds is 60
        boolean secondcheck = checkSecondsStub();
        if (secondcheck == false){
            return "Time is : " + "Hours : " + hours + " " + "Minutes : " + minutes + " " + "Seconds : " + seconds;
        }
        else{
            seconds = 0;
            return "Time is : " + "Hours : " + hours + " " + "Minutes : " + minutes + " " + "Seconds : " + seconds;
        }



    }

    public boolean checkSecondsStub(){
        if (seconds == 60){
            minutes++;
            checkMinutessStub();
            return true;
        }
        else {
            return false;
        }

    }
    public void checkMinutessStub(){
        if (minutes == 60){
            minutes = 0 ;
            hours ++;
            checkHoursStub();
        }


    }
    public void checkHoursStub(){
        if (hours==24){
            hours=0;
        }
    }



}
