package GCFL3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pendulam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int k =0;
        while(k < test) {
            int length = in.nextInt();
            in.nextLine();
            ArrayList<Integer> pendulam = new ArrayList<>();
            String[] arr = in.nextLine().trim().split(" ");
            int[] arrNew = new int[length];
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(arrNew);
            pendulam.add(arrNew[0]);
            for (int i = 0; i < arrNew.length; i++) {
                if (i % 2 != 0) {
                    pendulam.add(arrNew[i]);
                }
            }
            ArrayList<Integer> first = new ArrayList<>();
            for (int i = arrNew.length - 1; i > 0; i--) {
                if (i % 2 == 0) {
                    first.add(arrNew[i]);
                }
            }
            for (int i = 0; i < pendulam.size(); i++) {
                first.add(pendulam.get(i));
            }
            for (int i = 0; i < first.size(); i++) {
                System.out.print(first.get(i) + " ");
            }
            k++;
            System.out.println();
        }
    }
}
