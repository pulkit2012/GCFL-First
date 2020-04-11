package GCFL10;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test > 0){
            String input = in.nextLine().trim();
            if(input.length() > 10){
                String ans = input.charAt(0) + String.valueOf(input.length() - 2) + input.charAt(input.length()-1);
                System.out.println(ans);
            }
            else {
                System.out.println(input);
            }
            test--;
        }
    }
}
