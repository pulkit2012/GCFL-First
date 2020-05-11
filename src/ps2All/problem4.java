package ps2All;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        int prevChestIndex = 1;
        int prevBicepIndex = 2;
        int prevBackindex = 3;
        int chest = 0;
        int bicep = 0;
        int back = 0;
        for (int i = 1; i <= arr.length; i++) {
            if(i == prevChestIndex){
               chest += in.nextInt();
               prevChestIndex += 3;
            }
            else if(i == prevBicepIndex){
                bicep += in.nextInt();
                prevBicepIndex += 3;
            }
            else if(i == prevBackindex){
                back += in.nextInt();
                prevBackindex += 3;
            }
        }
        if(chest > back && chest > bicep){
            System.out.println("chest");
        }
        else if(back > chest && back > bicep){
            System.out.println("back");
        }
        else if(bicep > chest && bicep > back){
            System.out.println("biceps");
        }
    }
}
