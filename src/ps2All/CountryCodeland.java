package ps2All;

import java.util.ArrayList;
import java.util.Scanner;

public class CountryCodeland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test > 0) {
            int N = in.nextInt();
            int a = in.nextInt();
            in.nextLine();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            int sum = 0;
            boolean checker = false;
            ArrayList<Integer> arrL = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                sum = arr[i];
                for (int i1 = 0; i1 < arr.length; i1++) {
                    if (i != i1) {
                        sum = sum + arr[i1];
                        if (sum == a) {
                            arrL.add(sum);
                            checker = true;
                            break;
                        }
                    }
                }
                if (checker) {
                    break;
                }
            }
            if (arrL.size() == 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            test--;
        }
    }
}

