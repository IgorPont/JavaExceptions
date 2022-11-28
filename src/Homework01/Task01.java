package Homework01;

import java.io.File;

public class Task01 {
    public static void main(String[] args) {
        System.out.println(div(3, 0));

    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("Dividing by zero is not possible");
        }
        return a / b;
    }

    public static long getFileLength(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return -1;
        }
        return file.length();
    }

    public static void method(Object a) {
        if (a == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }
}
