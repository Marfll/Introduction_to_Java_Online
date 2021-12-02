package by.training.java_intro.s01_basics_of_software_code_development.t01_linenear_program;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */

public class Task5 {
    static void time(int t) {
        int h = t / 3600;
        int m = t / 60 - h * 60;
        int s = t - (h * 60 * 60 + m * 60);
        System.out.println(h + "ч " + m + "мин " + s + "с");
    }

    public static void main(String[] args) {
        time(10000);
    }
}
