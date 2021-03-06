package GCFL6ForM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TheLeadGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int k = 0;
        int[] playerOne = new int[test];
        int[] playerTwo = new int[test];
        while (k < test) {
            String[] arr = in.nextLine().trim().split(" ");
            playerOne[k] = Integer.parseInt(arr[0]);
            playerTwo[k] = Integer.parseInt(arr[1]);
            k++;
        }
        for (int i = 0; i < playerOne.length; i++) {
            if (i != 0) {
                playerOne[i] = playerOne[i] + playerOne[i - 1];
            }
        }
        for (int i = 0; i < playerTwo.length; i++) {
            if (i != 0) {
                playerTwo[i] = playerTwo[i] + playerTwo[i - 1];
            }
        }
        ArrayList<Integer> leadOne = new ArrayList<>();
        ArrayList<Integer> leadTwo = new ArrayList<>();
        for (int i = 0; i < test; i++) {
            if (playerOne[i] - playerTwo[i] < 0) {
                leadTwo.add(Math.abs(playerOne[i] - playerTwo[i]));
            } else {
                leadOne.add(playerOne[i] - playerTwo[i]);
            }
        }
        Collections.sort(leadOne);
        Collections.sort(leadTwo);
        if (leadOne.size() != 0 && leadTwo.size() != 0) {
        if (leadOne.get(leadOne.size() - 1) < leadTwo.get(leadTwo.size() - 1)) {
            System.out.println("2 " + leadTwo.get(leadTwo.size() - 1));
        } else {
            System.out.println("1 " + leadOne.get(leadOne.size() - 1));
        }
    }
        else{
            if(leadOne.size() == 0){
                System.out.println("2 " + leadTwo.get(leadTwo.size()-1));
            }
            else{
                System.out.println("1 " + leadOne.get(leadOne.size()-1));
            }
        }
    }
}