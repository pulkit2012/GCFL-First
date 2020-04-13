package GCFL11;

import java.util.Scanner;
import java.util.TreeSet;

public class StonesOntheTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        String stones = in.nextLine().trim();
        int counter = 0;
        for (int i = 0; i < stones.length()-1; i++) {
            if(stones.charAt(i) == stones.charAt(i+1)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
