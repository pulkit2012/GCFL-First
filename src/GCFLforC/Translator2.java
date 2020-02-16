package GCFLforC;

import java.util.Scanner;

public class Translator2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] inputOne = in.nextLine().trim().split(" ");
        String s = inputOne[1];
        String upper = s.toUpperCase();
        int test = Integer.parseInt(inputOne[0]);
        int k = 0;
        while(k < test) {
            String lang = in.nextLine().trim();
            char[] input = lang.toCharArray();
            String translated = "";
            for (int i = 0; i < input.length; i++) {
                if(input[i] == '_'){
                    translated = translated + " ";
                }
                else if(input[i] == '!'){
                    translated = translated + '!';
                }
                else if(input[i] == '?'){
                    translated = translated + '?';
                }
                else if(input[i] == '.'){
                    translated = translated + '.';
                }
                else if ((int) input[i] < (int) 'a') {
                    translated = translated + (upper.charAt((int) input[i] - 'A'));
                }

                else {
                    translated = translated + (s.charAt((int) input[i] - 'a'));
                }
            }
            System.out.println(translated);
        k++;
        }
    }
}
