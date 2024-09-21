package warmup;

public class ParrotTrouble {
    public static void main(String[] args) {
        boolean parrotNoise = true;
        int hour = 6;
        System.out.println(parrotTrouble(parrotNoise,hour));

    }
    public static boolean parrotTrouble(boolean talking,int hour){
        if(talking && (hour>20 || hour<7)){
            return true;
        }else {
            return false;
        }
    }
    /*We have a loud talking parrot.
    The "hour" parameter is the current hour time in the range 0..23.
     We are in trouble if the parrot is talking and the hour is before 7 or after 20.
     Return true if we are in trouble.



        //test
    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false*/
}
