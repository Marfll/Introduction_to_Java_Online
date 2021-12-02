package by.training.java_intro.s01_basics_of_software_code_development.t03_cycles;

import java.util.Scanner;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */


public class Test7 {
    public static void main(String[] args) {
        int[] naturalNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int m;
        int n;

        m = enterFromConsole("m >> ");
        n = enterFromConsole("n >> ");

        for (int i = 0; i < naturalNumbers.length; i++) {
            for (int j : naturalNumbers)
                if ((naturalNumbers[i] % j) == 0) {
                    if (naturalNumbers[i] != j && j != 1)
                        if (naturalNumbers[i] >= m && naturalNumbers[i] <= n)
                            System.out.println("Делитель числа " + naturalNumbers[i] + " - " + j);
                }
        }
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
}
