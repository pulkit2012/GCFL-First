package ps2All;

import java.util.Scanner;

public class CompareTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine().trim();
        String input2 = in.nextLine().trim();
        int storer = input1.compareToIgnoreCase(input2);
        if(storer < 0){
            System.out.println(-1);
        }
        else if(storer > 0){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
