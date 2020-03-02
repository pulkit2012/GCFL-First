package GCFL9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayT3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        in.nextLine();
        String[] arr = in.nextLine().trim().split(" ");
        int[] arrInt = new int[length];
        for (int i = 0; i < length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        ArrayList<Integer> arrAns = new ArrayList<>();
        for (int i = 0; i < arrInt.length; i++) {
            if(i == 0){
                arrAns.add(arrInt[i] * arrInt[i +1]);
            }
            else if(i == arrInt.length-1){
                arrAns.add(arrInt[i] * arrInt[i-1]);
            }
            else {
                arrAns.add(arrInt[i-1] * arrInt[i+1]);
            }
        }
        for (int i = 0; i < arrAns.size(); i++) {
            System.out.print(arrAns.get(i) + " ");
        }
    }
}
