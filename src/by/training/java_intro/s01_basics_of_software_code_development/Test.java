package by.training.java_intro.s01_basics_of_software_code_development;

import java.util.Random;

import static java.lang.Math.abs;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Test {
    public static void main(String[] args) {
        int a;
        int b;
        Random random = new Random();

        a = abs(random.nextInt());
        b = abs(random.nextInt());

        System.out.print("Общие значения для " + a + " и " + b + " : ");
        for (int i = a; i > 0; i /= 10)
            for (int j = b; j > 0; j /= 10)
                if (i % 10 == j % 10)
                    System.out.print(i % 10 + " ");
    }
}
