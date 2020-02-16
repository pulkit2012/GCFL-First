package ArrayPractiseQuestions;

public class ArrayConverter {
    public static int[] arrGetter(String[] arr){
        int[] intArr = new int[arr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        return intArr;
    }
}
