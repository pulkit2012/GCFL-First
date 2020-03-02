package GCFL9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GoldBuyer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        int max = 0;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String[] arr = in.nextLine().trim().split(" ");
            if (Integer.parseInt(arr[0]) > 1) {
                if (arr.length > 2) {
                    count.add(Integer.parseInt(arr[0]));
                    names.add(arr[1] + " " + arr[2]);
                } else {
                    count.add(Integer.parseInt(arr[0]));
                    names.add(arr[1]);
                }
            }
        }
        if (count.size() != 0) {
            ArrayList<Integer> index = new ArrayList<>();
            for (int i = 0; i < count.size(); i++) {
                if (count.get(i) > max) {
                    max = count.get(i);
                }
            }
            for (int i = 0; i < count.size(); i++) {
                if (count.get(i) == max) {
                    index.add(i);
                }
            }
            System.out.println(names.get(index.get(0)));
        }
        else {
            System.out.println("No Frequent Buyer");
        }
    }
}
