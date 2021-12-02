package by.training.java_intro.s01_basics_of_software_code_development.t03_cycles;

import static java.lang.Math.pow;

/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task4 {
    public static void main(String[] args) {
        long multiplication = 1;

        for (int i = 1; i <= 200; i++)
            multiplication *= pow(i, 2);

        System.out.println(multiplication);
    }
}
