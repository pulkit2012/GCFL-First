package GCFL4;

import java.util.ArrayList;
import java.util.Scanner;

public class ThiefAndCops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int z = 0;
        while(z < test) {
            String[] valuesHelper = in.nextLine().trim().split(" ");
            int covered = Integer.parseInt(valuesHelper[1]) * Integer.parseInt(valuesHelper[2]);
            String[] numbersHelper = in.nextLine().trim().split(" ");
            int[] numbers = new int[numbersHelper.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(numbersHelper[i]);
            }
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                arr.add(1);
            }
            if(covered > 100){
                System.out.println(0);
            }
            else {
                for (int k = 0; k < numbers.length; k++) {
                    if (numbers[k] < covered) {
                        for (int i = numbers[k]; i >= 0; i--) {
                            arr.set(i, 2);
                            if (i == 100) {
                                break;
                            }
                        }
                    } else {
                        for (int i = numbers[k]; i >= (numbers[k] - covered)-1; i--) {
                            arr.set(i, 2);
                            if(i == 0){
                                break;
                            }
                        }
                    }
                }
                for (int k = 0; k < numbers.length; k++) {
                    if (numbers[k] > (100 - covered)) {
                        for (int i = numbers[k]; i <= 100; i++) {
                            if (i == 100) {
                                break;
                            }
                            arr.set(i, 2);

                        }
                    } else {
                        for (int i = numbers[k]; i < numbers[k] + covered; i++) {
                            arr.set(i, 2);
                        }
                    }
                }
                int counter = 0;
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i) == 1) {
                        counter++;
                    }
                }
                System.out.println(counter);
            }
            z++;
        }
    }
}
