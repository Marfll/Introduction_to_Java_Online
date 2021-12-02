package by.training.java_intro.s01_basics_of_software_code_development.t03_cycles;

/*
Найти сумму квадратов первых ста чисел.
 */

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++)
            sum += Math.pow(i, 2);

        System.out.println(sum);
    }
}
