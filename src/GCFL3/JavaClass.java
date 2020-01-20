package GCFL3;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        String[] arrNew = in.nextLine().trim().split(" ");
        int[] arr = new int[a];
        for (int i = 0; i < arrNew.length; i++) {
            arr[i] = Integer.parseInt(arrNew[i]);
        }
        ArrayList<Integer> arrZeroes = new ArrayList<>();
        ArrayList<Integer> arrNot = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arrZeroes.add(arr[i]);
            }
            else {
                arrNot.add(arr[i]);
            }
        }
        for (int i = 0; i < arrZeroes.size(); i++) {
            arrNot.add(arrZeroes.get(i));
        }
        for (int i = 0; i < arrNot.size(); i++) {
            System.out.print(arrNot.get(i) + " ");
        }
    }
}
