package GCFL8forb;

import java.util.Scanner;

public class MinCostChoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        String[] arr = in.nextLine().trim().split(" ");
        int[] stat = new int[len];
        for (int i = 0; i < stat.length; i++) {
            stat[i] = Integer.parseInt(arr[i]);
        }
        int buy = stat[0];
        int cost = in.nextInt();
        in.nextLine();
        int storer = stat[0];
        for (int i = 1; i < stat.length; i++) {
            int ans = storer - stat[i];
            if(ans < 0){
                buy = buy + Math.abs(ans);
                storer = buy;
            }

            ans = 0;
        }
        System.out.println(buy*cost);
    }
}
