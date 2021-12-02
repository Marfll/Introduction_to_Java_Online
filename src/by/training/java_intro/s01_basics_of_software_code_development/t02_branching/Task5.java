package by.training.java_intro.s01_basics_of_software_code_development.t02_branching;

import static java.lang.Math.*;

/*
Вычислить значение функции.
 */

public class Task5 {
    static void function(double x) {
        double y;
        if (x > 3)
            y = 1 / (pow(x, 3) + 6);
        else
            y = pow(x, 2) - 3 * x + 9;

        System.out.println(y);
    }

    public static void main(String[] args) {
        function(4);
    }
}
