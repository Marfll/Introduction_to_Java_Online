package by.training.java_intro.s01_basics_of_software_code_development.t01_linenear_program;

/*
Найдите значение фугкции  z = ((a - 3) * b / 2) + c.
 */

public class Task1 {
    static double functionValue(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }

    public static void main(String[] args) {
        System.out.println(functionValue(1, 29, 3));
    }
}
