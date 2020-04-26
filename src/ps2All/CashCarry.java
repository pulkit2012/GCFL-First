package ps2All;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CashCarry {
    static String CarryChecker(int[] arr) {
        String ans = "";
        String a1 = String.valueOf(arr[0]);
        String a2 = String.valueOf(arr[1]);
        int prevCarry = 0;
        for (int i = a2.length() - 1; i >= 0; i--) {
            for (int i1 = a1.length() - 1; i1 >= 0; i1--) {
                int check = Integer.parseInt(String.valueOf(a2.charAt(i))) * Integer.parseInt(String.valueOf(a1.charAt(i1)));
                check = check + prevCarry;
                if (check >= 10) {
                    if (i1 != 0) {
                        ans = ans + String.valueOf(check).charAt(0);
                        prevCarry = (check / 10);
                    }
                }
                else {
                    prevCarry = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test > 0) {
            int[] arr = new int[2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            if (CarryChecker(arr).length() == 0) {
                System.out.println(CarryChecker(arr).length() + " " + 0);
            } else {
                System.out.println(CarryChecker(arr).length() + " " + CarryChecker(arr));
            }
            test--;
        }
    }
}