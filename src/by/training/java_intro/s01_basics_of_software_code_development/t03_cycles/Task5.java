package by.training.java_intro.s01_basics_of_software_code_development.t03_cycles;

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е.
 */

public class Task5 {
    public static void main(String[] args) {
        int [] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        double e = 0.1;

        for (int i = 0; i < t.length ; i++) {

            double a = 1 / Math.pow(2, i + 1) + 1 / (Math.pow(3, i + 1));
            if (Math.abs(a) >= e ){
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
