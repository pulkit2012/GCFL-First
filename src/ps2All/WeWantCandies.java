package ps2All;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WeWantCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int k = 0;
        while (k < test) {
            char[] array = in.nextLine().toCharArray();
            Arrays.sort(array);
            int count = 1;
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<array.length-1; i++)
                if(array[i]==array[i+1])
                    count++;
                else{
                    int x = count%3;
                    arr.add(count);
                    count=1;
                }
            int x = count%3;
            arr.add(count);
            Collections.sort(arr);
            count=0;
            count=(arr.get(arr.size()-3))*3 ;
            System.out.println(count);
            k++;
        }
    }
}
