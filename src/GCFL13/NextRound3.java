package GCFL13;

import java.util.Scanner;

public class NextRound3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int checker = arr[k-1];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= checker && i != k-1){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
