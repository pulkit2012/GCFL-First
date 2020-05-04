package GCFL14;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        String a1 = in.nextLine();
        int counter = 0;
        for (int i = 0; i < a1.length(); i++) {
            if(a1.charAt(i) == '1'){
                counter++;
            }
        }
        int zeroes = a1.length() - counter;
        String an = "";
        if(counter > 0) {
            an = "1";
        }
        else {
             an = "";
        }
        for (int i = 0; i < zeroes; i++) {
            an = an + "0";
        }
        System.out.println(an);
    }
}
