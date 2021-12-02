package by.training.java_intro.s01_basics_of_software_code_development.t03_cycles;

/*
Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class Task1 {
    static void sum(int n) {
        int sum = 0;
        while (n <= 0)
            n = enterFromConsole("Введите целое положительное число >> ");
            for (int i = 1; i <= n; i++)
                sum += i;

        System.out.println(sum);
    }

    public static int enterFromConsole(String message) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int value;

        System.out.print(message);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(message);
        }
        value = scanner.nextInt();

        return value;
    }

    public static void main(String[] args) {
        int n = enterFromConsole("Введите целое положительное число >> ");
        sum(n);
    }

}
