package GCFL4;

import java.util.Scanner;

public class MonkeyAndBanana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int k =0;
        int storer =0;
        while(k < test){
            String[] arrFirst = in.nextLine().trim().split(" ");
            int[] arrNofMonkeys = new int[arrFirst.length];
            for (int i = 0; i < arrNofMonkeys.length; i++) {
                arrNofMonkeys[i] = Integer.parseInt(arrFirst[i]);
            }
            String[] arrSecond = in.nextLine().trim().split(" ");
            int[] arrWants = new int[arrNofMonkeys[0]];
            for (int i = 0; i < arrWants.length; i++) {
                arrWants[i] = Integer.parseInt(arrSecond[i]);
            }
            for (int i = 0; i < arrWants.length; i++) {
                storer = storer + arrWants[i];
            }
            if(storer <= arrNofMonkeys[1]){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            storer =0;
            System.out.println();
            k++;
        }
    }
}
