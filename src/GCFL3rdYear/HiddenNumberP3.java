package GCFL3rdYear;

import java.util.Scanner;

public class HiddenNumberP3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        long sum = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        long x = sum / len;
        System.out.println(x * len == sum ? x : -1);

    }
}
