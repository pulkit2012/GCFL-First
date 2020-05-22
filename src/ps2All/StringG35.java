package ps2All;

import java.util.Scanner;

public class StringG35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        in.nextLine();
        String a = in.nextLine().trim();
        StringBuilder builder = new StringBuilder(in.nextLine());
        for (int i = 0; i < q; i++) {
           int index = in.nextInt() - 1;
           builder.setCharAt(index,'1');
           if(String.valueOf(builder).compareTo(a) >= 0){
               System.out.println("YES");
            }
           else {
               System.out.println("NO");
           }
        }
    }
}
