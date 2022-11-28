package Homework01;

public class Task02 {
    public static void main(String[] args) {
        String[][] array = {{}, {}};
        System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    // Types of exceptions that can be obtained:
    // - ArrayIndexOutOfBoundsException
    // - Incompatible types
    // - Empty array
    // - NumberFormatException

}
