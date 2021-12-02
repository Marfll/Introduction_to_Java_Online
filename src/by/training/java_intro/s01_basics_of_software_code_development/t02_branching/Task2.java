package by.training.java_intro.s01_basics_of_software_code_development.t02_branching;

import static java.lang.Math.max;
import static java.lang.Math.min;

/*
Найти max{min(a, b), min(c, d)}.
 */

public class Task2 {
    static void maxValue(int a, int b, int c, int d) {
        System.out.println(max(min(a, b), min(c, d)));
    }

    public static void main(String[] args) {
        maxValue(1, 2, 3, 4);
    }
}
