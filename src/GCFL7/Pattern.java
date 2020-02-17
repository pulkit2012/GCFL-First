package GCFL7;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int j = l - 1;
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < j; i1++) {
                if ((i == 0 || i1 == 0) || (i == n - 1 || i1 == j)) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("1");
        }
    }
}