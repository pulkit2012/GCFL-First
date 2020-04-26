package ps2All;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayT4E {
    static boolean countChecker(int element,int[] arr){
        int counter = 0;
        boolean response = false;
        for (int i = 0; i < arr.length; i++) {
            if(element == arr[i]){
                counter++;
            }
        }
        if(counter > (arr.length / 2)){
            response = true;
        }
        return response;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine();
        TreeSet<Integer> set = new TreeSet<>();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
            set.add(arr[i]);
        }
        ArrayList<Integer> ansCheck = new ArrayList<>();
        for (int k : set){
            if(countChecker(k,arr)){
                ansCheck.add(k);
                break;
            }
        }
        if(ansCheck.size() == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(ansCheck.get(0));
        }
    }
}
