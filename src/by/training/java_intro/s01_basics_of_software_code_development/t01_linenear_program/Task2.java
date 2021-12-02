package by.training.java_intro.s01_basics_of_software_code_development.t01_linenear_program;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

public class Task2 {
    static double functionValue(double a, double b, double c) {
        return ((b + sqrt((pow(b, 2)) + 4 * a * c) / (2 * a))) - pow(a, 3) * c + pow(b, -2);
    }

    public static void main(String[] args) {

        System.out.println(functionValue(1.24, 5.3, 6));
    }

}
