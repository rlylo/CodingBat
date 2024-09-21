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
}
