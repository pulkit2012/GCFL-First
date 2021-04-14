package GCFL3rdYear;

import java.util.Scanner;

public class BeautifulDays {
    static int reverser(int num){
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int counter = 0;
        in.nextLine();
        for (int i = a; i <= b; i++) {
            if(Math.abs(i - reverser(i)) % c == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
