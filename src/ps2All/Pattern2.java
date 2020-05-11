package ps2All;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();
        int first = 0;
        if(a % 2 != 0){
            first = a + 1;
        }
        else {
            first = a;
        }
        int storer = 0;
        int multiplier = 0;
        for (int i = 0; i < a; i++) {
            for (int i1 = 0; i1 < a; i1++) {
                if(i1 == 0){
                    storer = first * multiplier;
                    System.out.print(storer + " ");
                    multiplier++;
                }
                else {
                    storer += 2;
                    System.out.print(storer  + " ");
                }
            }
            System.out.println();
        }
    }
}
