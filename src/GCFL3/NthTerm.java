package GCFL3;

import java.util.Scanner;

public class NthTerm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int result = 7;
        for (int i = 1; i < a; i++) {
            result = (result*2)+i;
        }
        System.out.println(result);

    }
}
