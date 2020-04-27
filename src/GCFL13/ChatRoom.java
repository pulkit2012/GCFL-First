package GCFL13;


import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] str = string.toCharArray();
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        boolean[] flag = {false, false, false, false, false};
        int head = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = head; j < string.length(); j++) {
                if (ch[i] == str[j]) {
                    flag[i] = true;
                    head = ++j;
                    break;
                }
            }
        }
        if (flag[0] && flag[1] && flag[2] && flag[3] && flag[4]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
