package GCFL10;

import java.util.Scanner;
import java.util.TreeSet;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        TreeSet<Character> set = new TreeSet<>();
        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }
        if(set.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}
