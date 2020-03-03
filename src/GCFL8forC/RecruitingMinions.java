package GCFL8forC;

import java.util.ArrayList;
import java.util.Scanner;

public class RecruitingMinions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int houses = in.nextInt();
        in.nextLine();
        String[] arrMandC = in.nextLine().trim().split(" ");
        int M = Integer.parseInt(arrMandC[0]);
        int C = Integer.parseInt(arrMandC[1]);
        int aboveRiver = 0;
        int belowRiver = 0;
        for (int i = 0; i < houses; i++) {
            String[] coordinates = in.nextLine().trim().split(" ");
            if(Integer.parseInt(coordinates[1]) > (M*Integer.parseInt(coordinates[0]) + C)){
                aboveRiver = aboveRiver + Integer.parseInt(coordinates[2]);
            }
            else if(Integer.parseInt(coordinates[1]) < (M*Integer.parseInt(coordinates[0]) + C)){
                belowRiver = belowRiver + Integer.parseInt(coordinates[2]);
            }
        }
        System.out.println(Math.max(aboveRiver, belowRiver));
    }
}
