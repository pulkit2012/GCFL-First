package GCFL14;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();
        String vovels = "aeiou";
        String Consonents = "bcdfghjklmnpqrstvwxyz";
        int prev = 0;
        if(s.charAt(0) == 'n'){
            prev = 0;
        }
        else if(vovels.contains(String.valueOf(s.charAt(0)))){
           prev = 0;
        }
        else if(Consonents.contains(String.valueOf(s.charAt(0)))){
            prev = 1;
        }
        boolean temp = false;
        for (int i = 1; i < s.length(); i++) {
            if(prev == 0 || s.charAt(i) == 'n'){
                if(vovels.contains(String.valueOf(s.charAt(i))) || s.charAt(i) == 'n'){
                    prev = 0;
                }
                else {
                    prev = 1;
                }
            }
            else if(prev == 1 ){
                if(!vovels.contains(String.valueOf(s.charAt(i)))){
                    temp = false;
                    break;
                }
                else {
                    prev = 0;
                    temp = true;
                }
            }
        }
        if(s.charAt(s.length() -1) == 'n'){
            if(s.length() == 1){
                System.out.println("YES");
            }
            else if(temp){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else if(Consonents.contains(String.valueOf(s.charAt(s.length() -1)))){
            System.out.println("NO");
        }
        else if(temp){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
