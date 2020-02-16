package GCFLforC;

import java.util.Scanner;

public class BeLikeBumble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int k = 0;
        while (k < test){
            String[] a = in.nextLine().trim().split(" ");
            int reward = Integer.parseInt(a[0]);
            int days = Integer.parseInt(a[1]);
            int cells = 0;
            if(days == 3){
                reward = reward * 27;
            }
            else {
                for (int i = 0; i < days; i++) {
                    if (i != 2) {
                        cells = cells + ((i * 6) + 1);
                    }
                }
                reward = reward * cells;
            }
            System.out.println(reward);
            k++;
        }
    }
}
