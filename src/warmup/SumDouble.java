package warmup;

public class SumDouble {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int sum = sumDouble(a,b);
        System.out.println(sum);



    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }

    }
/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8*/


}
