package warmup;

public class diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(19));
    }
    public static int diff21(int n){
        if (n>21){
            return (n-21)*2;
        }else {
            return 21-n;
        }

    }
    /*Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.
    test
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0*/
}
