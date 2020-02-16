package GCFL5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AmISmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        in.nextLine();
        int test = 0;
        while(test < a1) {
            String a = in.nextLine().trim();
            String b = "";
            char[] storer = a.toCharArray();
            ArrayList<Character> arr = new ArrayList<>();
            for (int i = 0; i < storer.length; i++) {
                arr.add(storer[i]);
            }
            Collections.sort(arr);
            for (int i = 0; i < arr.size(); i++) {
                b = b + arr.get(i);
            }
            if(a.equals(b)){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
            test++;
        }

    }
}
