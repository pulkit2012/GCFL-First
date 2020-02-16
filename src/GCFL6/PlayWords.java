package GCFL6;

import java.util.HashMap;
import java.util.Scanner;

public class PlayWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().trim();
        String b = in.nextLine().trim();
        int[] first = new int[26];
        int[] second = new int[26];
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            int charValue = (int)c;
            int position = charValue - (int)'a';
            first[position]++;
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            int charValue = (int)c;
            int position = charValue - (int)'a';
            second[position]++;
        }
        int delete = 0;
        for (int i = 0; i < 26; i++) {
            int difference = Math.abs(first[i] - second[i]);
            delete = delete + difference;
        }
        System.out.println(delete);
    }
}
