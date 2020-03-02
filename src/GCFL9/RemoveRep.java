package GCFL9;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveRep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().trim();
        String ans = "";
        int i1 = 0;
        for (int i = 0; i < a.length(); i++) {
           if(i != a.length()-1){
               if(a.charAt(i) == a.charAt(i+1)){
                   ans = ans + "";
               }
               else {
                   ans = ans + a.charAt(i);
               }
           }
           else {
               ans = ans + a.charAt(i);
           }
        }
        System.out.println(ans);
    }
}
