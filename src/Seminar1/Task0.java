package Seminar1;

public class Task0 {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println(checkArrayLength(arr));
    }

    public static final int minLength = 3;

    public static int checkArrayLength(int[] arr){
        if(arr != null){
            if(arr.length < minLength) return -1;
            else return arr.length;
        }
        else return -2;
    }

}
