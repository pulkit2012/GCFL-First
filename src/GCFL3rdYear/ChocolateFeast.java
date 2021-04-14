package GCFL3rdYear;

import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.nextLine();
        int bought = a / b;
        int eaten = bought;
        int turn_in = 0;
        int wrapper = bought;
        while (true){
            turn_in = wrapper / c;
            if(turn_in >= 0 && wrapper >= c){
                eaten += turn_in;
            }
            else {
                break;
            }
            wrapper = (wrapper % c) + turn_in;
        }
        System.out.println(eaten);
    }
}
