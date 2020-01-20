package GCFL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().trim();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i) != '+'){
                    arr.add(Integer.parseInt(String.valueOf(a.charAt(i))));
                }
        }
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i));
            if(i == (arr.size()-1)){
                sb.append("");
            }
            else {
                sb.append("+");
            }

        }
        System.out.println(sb);
    }
}
