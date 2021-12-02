package by.training.java_intro.s01_basics_of_software_code_development.t01_linenear_program;

import java.text.DecimalFormat;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
    static double swap(double r) {
        double after = r % 1;
        double before = (r - after) / 1000;
        double result = after * 1000 + before;
        String formattedDouble = new DecimalFormat("#0.000").format(result);
        System.out.println(formattedDouble);
        return r;
    }

    public static void main(String[] args) {
        swap(654.321);
    }
}
