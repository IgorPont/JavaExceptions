package Seminar1;

public class Task01 {

    /*
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(checkExistValue(2, array));
    }
    */

    public static int checkExistValue(int value, int[] arr) {
        int minLength = 3;

        if (arr == null) return -3;
        else if (arr.length < minLength) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -2;
    }
}
