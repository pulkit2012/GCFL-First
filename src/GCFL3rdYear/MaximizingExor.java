package GCFL3rdYear;

import java.util.Scanner;

public class MaximizingExor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        int b = in.nextInt();
        in.nextLine();
        int temp1 = a;
        int temp2 = b;
        int max = Integer.MIN_VALUE;
        for (int i = temp1; i <= temp2; i++) {
            for (int i1 = i; i1 <= temp2; i1++) {
                if((i ^ i1) > max){
                    max = (i ^ i1);
                }
            }
        }
        System.out.println(max);
    }
}
