package GCFL3rdYear;

import java.util.Scanner;

public class PatternT29H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int lines = in.nextInt();
        in.nextLine();
        int num_in_lines = 1;
        int temp = 1;
        int starter = start;
        for (int i = 0; i < lines; i++) {
            if (i == 0) {
                System.out.print(start + " ");
                num_in_lines *= 2;
                System.out.println();
            } else {
                starter *= 2;
                int temp2 = starter;
                temp = num_in_lines;
                for (int i1 = 0; i1 < temp; i1++) {
                    System.out.print(temp2++ + " ");
                }
                System.out.println();
                num_in_lines *= 2;
            }
        }
    }
}
