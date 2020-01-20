package GCFL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Candies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        int counter = 0;
        int a = in.nextInt();
        int k = 0;
        in.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        while (k < a) {
            arr.add(in.nextLine());
            k++;
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int i1 = 0; i1 < arr.get(i).length(); i1++) {
                set.add(arr.get(i).charAt(i1));
            }
            System.out.println(set.size());
            set.removeAll(set);

        }

    }
}
