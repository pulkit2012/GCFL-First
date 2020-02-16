package GCFL4;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int k =0;
        String result =  "";
        while (k < test){
            String a =  in.nextLine();
            result = a.replace("4","");
            result = result.replace("7","");
            System.out.println(result.length());
            result = "";
            k++;
        }
    }
}
