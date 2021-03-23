package GCFL3rdYear;

import java.util.Scanner;

public class AlligationProblem {
    static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int z = in.nextInt();
        in.nextLine();
        if (a < b) {
            int temp = 0;
            temp = a;
            a = b;
            b = temp;
        }
        int num1 = a - z;
        int num2 = z - b;
        int gcd = gcd(num1,num2);
        System.out.println(num1 / gcd + ":" + num2/gcd);

    }
}
