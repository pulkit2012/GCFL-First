package GCFL8forb;

import java.util.ArrayList;
import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        in.nextLine();
        String[] arr = in.nextLine().trim().split(" ");
        int[] arrInt = new int[length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        ArrayList<Integer> peakArr = new ArrayList<>();
        for (int i = 1; i < arrInt.length; i++) {
             if(i < (arrInt.length-1)){
                if(arrInt[i] > arrInt[i+1] && arrInt[i] > arrInt[i-1]){
                    peakArr.add(arrInt[i]);
                }
            }
        }
        System.out.println(peakArr.get(0));
    }
}

