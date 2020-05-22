package ps2All;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayT2E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int k = in.nextInt();
        int product = 1;
        for (int i = 0; i < k; i++) {
            product *= arr[i];
        }
        System.out.println(product);
    }
}
