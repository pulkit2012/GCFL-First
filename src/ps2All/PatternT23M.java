package ps2All;

import java.util.Scanner;

public class PatternT23M {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            // Print '*'
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            // Print space
            for (int k = 1; k < (2*i - 1); k++) {
                System.out.print("  ");
            }

            // Print '*'
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            System.out.print(System.lineSeparator());
        }

        // Print lower half
        for (int i = n ; i >= 1; i--)
        {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            for (int k = 1; k < (2*i - 1); k++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.print(System.lineSeparator());
        }
    }
}