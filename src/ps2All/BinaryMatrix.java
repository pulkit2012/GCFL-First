package ps2All;

import java.util.Scanner;

public class BinaryMatrix {
    static int coverageChecker(int[][] matrix,int i,int i1,int row,int column){
     int upValue = 0;
     int bottomValue = 0;
     int right = 0;
     int left = 0;
     int U = i;
     int B = i;
     int R = i1;
     int L = i1;
     while(U > 0){
          U--;
         if(matrix[U][i1] == 1){
             upValue++;
             break;
         }
     }
     while(B < row - 1){
         B++;
         if(matrix[B][i1] == 1){
             bottomValue++;
             break;
         }
     }
     while(R < column -1){
         R++;
         if(matrix[i][R] == 1){
             right++;
             break;
         }
     }
     while(L > 0){
         L--;
         if(matrix[i][L] == 1){
             left++;
             break;
         }
     }
     return (upValue + bottomValue + right + left);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        int[][] sqMatrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int i1 = 0; i1 < column; i1++) {
                sqMatrix[i][i1] = in.nextInt();
            }
        }
        int value = 0;
        for (int i = 0; i < row; i++) {
            for (int i1 = 0; i1 < column; i1++) {
                if(sqMatrix[i][i1] == 0){
                    value = value + coverageChecker(sqMatrix,i,i1,row,column);
                }
            }
        }
        System.out.println(value);
    }
}
