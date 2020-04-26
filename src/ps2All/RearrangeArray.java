package ps2All;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class RearrangeArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] a1 = new int[n];
        for(int i = 0;i<n;i++) {
            a1[i] = in.nextInt();
        }
        for(int i = 0; i<n-1 ; i++){
            if(i%2 == 0){
                if(a1[i] > a1[i+1]){
                    int temp = a1[i];
                    a1[i] = a1[i+1];
                    a1[i+1] = temp;
                }
            }
            else{
                if( a1[i] < a1[i+1]){
                    int temp = a1[i];
                    a1[i] = a1[i+1];
                    a1[i+1] = temp;
                }
            }
        }
        for(int i : a1) {
            System.out.print(i + " ");
        }
    }
}