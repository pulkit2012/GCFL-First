package GCFL8forb;

import java.util.ArrayList;
import java.util.Scanner;

public class StringAns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        ArrayList<String> arr = new ArrayList<>();
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < 3; i++) {
            arr.add(in.nextLine().trim());
        }
        for (int i = 0; i < arr.get(0).length(); i++) {

            if(vowel.contains(String.valueOf(arr.get(0).charAt(i)))){
                s = s + "$";
            }
            else{
                s = s + arr.get(0).charAt(i);
            }
        }
        for (int i = 0; i < arr.get(1).length(); i++) {
            if(vowel.contains(String.valueOf(arr.get(1).charAt(i))) == false){
                s = s + "#";
            }
            else {
                s = s + arr.get(1).charAt(i);
            }
        }
        s = s + arr.get(2).toUpperCase();
        System.out.println(s);
    }
}
