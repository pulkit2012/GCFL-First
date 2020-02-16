package GCFL6ForM;

import java.util.ArrayList;
import java.util.Scanner;

public class StringAlterNate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        int zeroes = 0;
        int ones =  0;
        String s = "";
        int zeroLength = in.nextInt();
        in.nextLine();
        int onesLength = in.nextInt();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '0'){
                zeroes++;
            }
            else {
                ones++;
            }
        }
        while(zeroes != 0 && ones != 0){
            for (int i = 0; i < zeroLength; i++) {
                s = s + '0';
                zeroes--;
            }
            for (int i = 0; i < onesLength; i++) {
                s = s + '1';
                ones--;
            }
        }
        if(zeroes != 0) {
            for (int i = 0; i < zeroes; i++) {
                s = s + '0';
            }
        }
        else if(ones != 0){
            for (int i = 0; i < ones; i++) {
                s = s + '1';
            }
        }
        System.out.println(s);
    }
}