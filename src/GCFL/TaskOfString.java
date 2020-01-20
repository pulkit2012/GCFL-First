package GCFL;

import java.util.Scanner;

public class TaskOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String check = "aeiou";
        a = a.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (check.contains(String.valueOf(a.charAt(i)))) {
                sb.append("");
            }
            else {
                sb.append(".");
                sb.append(a.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
