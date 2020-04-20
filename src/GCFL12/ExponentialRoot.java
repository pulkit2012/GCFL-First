package GCFL12;

import java.math.BigInteger;
import java.util.Scanner;

public class ExponentialRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        double big = Math.pow(A,B);
        String processed = String.format("%.0f", big);
        int adder = 0;
        while (true){
            for (int i = 0; i < processed.length(); i++) {
                adder = adder + Integer.parseInt(String.valueOf(processed.charAt(i)));
            }
            if(String.valueOf(adder).length() == 1){
                break;
            }
            else {
                processed = String.valueOf(adder);
                adder = 0;
            }
        }
        System.out.println(adder);
    }
}
