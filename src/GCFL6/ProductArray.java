package GCFL6;

import java.util.Scanner;

public class ProductArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        int ans =1;
        String[] arr = in.nextLine().trim().split(" ");
        int[] arrInt = new int[a];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt.length;j++){
                if(i != j){
                    ans = ans*arrInt[j];
                }
            }
            System.out.print(ans + " ");
            ans = 1;
        }

    }
}
