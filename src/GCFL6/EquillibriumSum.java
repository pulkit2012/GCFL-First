package GCFL6;

import java.util.ArrayList;
import java.util.Scanner;

public class EquillibriumSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        ArrayList<Integer> ans = new ArrayList<>();
        String[] a1 = in.nextLine().trim().split(" ");
        int[] arr = new int[a1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(a1[i]);
        }
        int sum1 = 0;
        int sum2 = 0;
        int storer = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
            for (int i1 = i; i1 < arr.length; i1++) {
                sum2 = sum2 + arr[i1];
                if (i1 == arr.length - 1) {
                    storer = sum2;
                }
            }
            if (sum1 == storer) {
                ans.add(storer);
            }
            sum2 = 0;
        }
        if (ans.size() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(ans.get(0));
        }

    }
}