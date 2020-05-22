package ps2All;

import java.util.Scanner;

public class LazyAyush {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test > 0){
            long n = in.nextLong();
            long b = in.nextLong();
            long m = in.nextLong();
            long time = 0;
            while(true){
                if(n == 1){
                    time += n * m;
                    break;
                }
                long breakAfter = (n % 2 == 0) ? n / 2 : (n + 1) / 2;
                time += breakAfter * m;
                time += b;
                n = n - breakAfter;
                m = m*2;
            }
            System.out.println(time);
            test--;
        }
    }
}
