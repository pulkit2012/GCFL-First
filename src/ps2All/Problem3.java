package ps2All;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += in.nextInt();
        }
        System.out.println((sum % len == 0) ? len : len -1);
    }
}
