package ps2All;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommon {
    static boolean indexChecker(int index,String[] arr,char ch){
        boolean response = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(index) == ch){
                response = true;
            }
            else {
                response = false;
                break;
            }
        }
        return response;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test  > 0){
            int len = in.nextInt();
            in.nextLine();
            String[] arr = new String[len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextLine();
            }
            Arrays.sort(arr);
            String ans = "";
            for (int i = 0; i < arr[0].length(); i++) {
                if(indexChecker(i,arr,arr[0].charAt(i))){
                    ans = ans + arr[0].charAt(i);
                }
                else {
                    break;
                }
            }
            if(ans.length() == 0){
                System.out.println(-1);
            }
            else {
                System.out.println(ans);
            }
            test--;
        }
    }
}
