/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
package Homework02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        String str = iScaner.nextLine();
        str = str.trim();
        if(str.isEmpty())
            throw new IllegalArgumentException("The line is empty.");
        else
            System.out.println(str);
    }
}
