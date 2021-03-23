package GCFL3rdYear;

import java.util.Scanner;

public class SumVsExor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long n = in.nextLong();
        int zeroCounter = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                zeroCounter++;
            }
            n /= 2;
        }
        System.out.println((long) Math.pow(2, zeroCounter));
    }
}
