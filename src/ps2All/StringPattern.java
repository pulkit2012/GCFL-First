package ps2All;

import java.util.Scanner;

public class StringPattern {
    public static int count(String X, String Y, int m, int n)
    {
        if (m == 1 && n == 1)
            return (X.charAt(0) == Y.charAt(0)) ? 1: 0;

        if (m == 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }
        if (n > m) {
            return 0;
        }
        return ((X.charAt(m-1) == Y.charAt(n-1)) ?
                count(X, Y, m - 1, n - 1) : 0)
                + count(X, Y, m - 1, n);
    }

    // main function
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String X = in.nextLine().trim();   // input String
        String Y = in.nextLine().trim();		// pattern

        System.out.print(count(X, Y, X.length(), Y.length()));
    }
}

