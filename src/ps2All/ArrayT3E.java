package ps2All;


import java.util.Scanner;

public class ArrayT3E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        long[] arr = new long[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextLong();
        }
        long[] arr2 = new long[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                arr2[i] = arr[i] * arr[i + 1];
                System.out.print(arr2[i] + " ");
            } else if (i == len - 1) {
                arr2[i] = arr[i] * arr[i - 1];
                System.out.print(arr2[i] + " ");
            } else {
                arr2[i] = arr[i - 1] * arr[i + 1];
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
