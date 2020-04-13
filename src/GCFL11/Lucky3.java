package GCFL11;

import java.util.ArrayList;
import java.util.Scanner;

public class Lucky3 {
    static boolean luckyChecker(String a){
        boolean resp = true;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '4' || a.charAt(i) == '7'){
                resp = true;
            }
            else {
                resp = false;
                break;
            }
        }
        return resp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String b = String.valueOf(a);
        ArrayList<String> arr = new ArrayList<>();
        if(luckyChecker(b)){
            System.out.println("YES");
        }

        else {
            for (int i = 1; i < a; i++) {
                if(luckyChecker(String.valueOf(i)) && (a % i == 0)){
                    arr.add("YES");
                    break;
                }
            }
            if(arr.size() > 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}