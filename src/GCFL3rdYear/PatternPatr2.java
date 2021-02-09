package GCFL3rdYear;

import java.util.Scanner;

public class PatternPatr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i;
        int i1;
        int p = 0;
        int lines = a / 2 + 1;
        for (i = 1; i <= lines; i++) {
            for (i1 = i; i1 < lines; i1++) {
                System.out.print(" ");
            }
            p = i;
            for (i1 = 1; i1 <= i; i1++) {
                System.out.print(p--);
            }
            p=2;
            for (i1 = 1; i1 < i; i1++) {
                System.out.print(p++);
            }
            System.out.println();
        }
        lines = lines - 1;
        for (i = 1; i <= lines; i++) {
            for(i1 = 0;i1<i;i1++){
                System.out.print(" ");
            }
            p=lines-i+1;
            for(i1 = i;i1<=lines;i1++){
                System.out.print(p--);
            }
            p = 2;
            for (i1=i;i1<lines;i1++)
            {
                System.out.print(p++);
            }
            System.out.println();

        }
    }
}
