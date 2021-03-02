package GCFL3rdYear;

import java.util.Scanner;

public class EncryptedArray1P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        int sum2 = sum / (len - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(sum2 - arr[i] + " ");
        }
    }
}
