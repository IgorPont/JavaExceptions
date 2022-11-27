package Seminar1;

public class Task02 {
    public static int sumElem(int[][] arr){
        int sum = 0;
        if(arr == null){
            throw new RuntimeException("Array empty");
        }
        else if (arr.length != arr[0].length){
            throw new RuntimeException("The array is not square");
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if(arr[i][j] != 0 || arr[i][j] != 1){
                        throw new RuntimeException("The array should only contain elements 0 or 1");
                    }
                    else sum += arr[i][j];
                }
            }
        }
        return sum;
    }

}
