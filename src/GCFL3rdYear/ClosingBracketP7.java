package GCFL3rdYear;

import java.util.Scanner;
import java.util.Stack;

public class ClosingBracketP7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();
        int input = in.nextInt();
        if (s.charAt(input) != '[') {
            System.out.println(-1);
        } else {
            Stack<Character> stack = new Stack<>();
            int counter = input;
            for (int i = input; i < s.length(); i++) {
                if (s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == ']') {
                    stack.remove(stack.peek());
                }
                if (stack.isEmpty()) {
                    break;
                }
                counter++;
            }
            System.out.println(stack.isEmpty() ? counter : -1);
        }
    }
}
