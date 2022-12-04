/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
package Homework02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter a fractional number: ");
        while (!iScanner.hasNextFloat()) {
            System.out.print("You didn't enter a fractional number, try again: ");
            iScanner.next();
        }
        System.out.printf("You have entered: %f", iScanner.nextFloat());
        iScanner.close();
    }
}
