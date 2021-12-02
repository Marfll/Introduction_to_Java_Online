package by.training.java_intro.s01_basics_of_software_code_development.t01_linenear_program;

import static java.lang.Math.*;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

public class Task3 {
    static double functionValue(double x, double y) {
        return ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
    }

    public static void main(String[] args) {
        System.out.println(functionValue(12.2, 4.4));
    }
}
