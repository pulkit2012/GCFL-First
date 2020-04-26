package ps2All;

import java.util.ArrayList;
import java.util.Scanner;

public class football {
    static boolean zeroChecker(String s){
        boolean zeocount = false;
        ArrayList<Integer> arr = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0'){
                counter++;
            }
            else {
                counter = 0;
            }
            if(counter == 7){
                arr.add(0);
                break;
            }
        }
        if(arr.size() >= 1){
            zeocount = true;
        }
        return zeocount;
    }
    static boolean oneChecker(String s){
        boolean OneCount = false;
        ArrayList<Integer> arr = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                counter++;
            }
            else {
                counter = 0;
            }
            if(counter == 7){
                arr.add(0);
                break;
            }
        }
        if(arr.size() >= 1){
            OneCount = true;
        }
        return OneCount;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        if(zeroChecker(input) || oneChecker(input)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
