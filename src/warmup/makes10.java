package warmup;

public class makes10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(makes10(a,b));



    }
        public static boolean makes10(int a , int b){
            if (a+b==10 || (a == 10 || b == 10)){
                return true;
            }else {
                return false;
            }

        }

    /*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    //test 
    


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true*/

}
