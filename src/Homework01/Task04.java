package Homework01;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int[] array1 = {4, 3, 2, 1};
        int[] array2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(difArrays(array1, array2)));
    }

    public static float[] difArrays(int[] arr1, int[] arr2) {
        if (arr1 != null && arr2 != null && arr1.length != 0 && arr2.length != 0 ){
            throw new RuntimeException("Arrays cannot be empty");
        } else if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays must be the same length");
        } else {
            float[] dif = new float[arr1.length];
            for (int i = 0; i < dif.length; i++) {
                dif[i] = (float) arr1[i] / (float) arr2[i];
            }
            return dif;
        }

    }
}
