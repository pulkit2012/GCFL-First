package ps2All;

import java.util.Scanner;

public class MissingTerm {
    static boolean finder(int[] arr, int element){
        boolean response = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                response = true;
                break;
            }
        }
        return response;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new  int[len];
        in.nextLine();
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int An = arr[len - 1];
        int A1 = arr[0];
        double a = Math.round(Math.pow((An / A1),(1.0 / len)));
        for (int i = 1; i < len + 1; i++) {
            if(!finder(arr, (int) Math.pow(a, i))){
                System.out.println((int)Math.pow(a,i));
            }
        }
    }
}
