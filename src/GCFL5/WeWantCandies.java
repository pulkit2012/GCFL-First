package GCFL5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WeWantCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int k =0;
        while(k < test) {
            ArrayList<Integer> arr = new ArrayList<>();
            String candies = in.nextLine().trim();
            int[] alpha = new int[26];
            for (int i = 0; i < candies.length(); i++) {
                char thisAlpha = candies.charAt(i);
                int char_value = (int) thisAlpha;
                int position = char_value - (int) 'a';
                alpha[position]++;
            }
            for (int i = 0; i < alpha.length; i++) {
                if (alpha[i] != 0) {
                  arr.add(alpha[i]);
                }
            }
            Collections.sort(arr);
            System.out.println(arr.get(0) * arr.size());
        k++;
        }
    }
}
