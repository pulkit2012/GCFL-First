package GCFL12;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int statements = in.nextInt();
        in.nextLine();
        int value = 0;
        String plus = "++";
        String minus = "--";
        while (statements > 0) {
            String stat = in.nextLine().trim();
            if(stat.contains(plus)){
                value++;
            }
            else if(stat.contains(minus)) {
                value--;
            }
            statements--;
        }
        System.out.println(value);
    }
}
