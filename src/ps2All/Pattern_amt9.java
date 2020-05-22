package ps2All;

import java.util.Scanner;

public class Pattern_amt9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int index = a - 2;
        for (int i = 0; i < (a + 1); i++) {
            for (int i1 = 0; i1 < a; i1++) {
                if (i == 0) {
                    System.out.print(a);
                } else {
                    if (i1 != index) {
                        System.out.print(a);
                    } else {
                        System.out.print(i);
                    }
                }
            }
            System.out.println();
        }
    }
}

