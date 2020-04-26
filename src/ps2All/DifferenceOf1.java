package ps2All;

import java.util.ArrayList;
import java.util.Scanner;

public class DifferenceOf1 {
    static boolean differenceCounter(long value){
        String s = String.valueOf(value);
        boolean respnse = false;
        for (int i = 0; i < s.length() - 1; i++) {
            if(Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1)) == 1){
                respnse = true;
            }
            else {
                respnse = false;
                break;
            }
        }
        return respnse;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test > 0){
            ArrayList<Long> arrL = new ArrayList<>();
            int N = in.nextInt();
            long K = in.nextLong();
            in.nextLine();
            long[] arr = new long[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextLong();
                if(arr[i] < K){
                    if(differenceCounter(arr[i])){
                       arrL.add(arr[i]);
                    }
                }
            }
            if(arrL.size() == 0){
                System.out.println(-1);
            }
            else {
                for (long l : arrL){
                    System.out.print(l + " ");
                }
            }
            System.out.println();
            test--;
        }
    }
}