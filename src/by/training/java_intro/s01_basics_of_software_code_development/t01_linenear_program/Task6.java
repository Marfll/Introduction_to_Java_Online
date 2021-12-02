package by.training.java_intro.s01_basics_of_software_code_development.t01_linenear_program;

/*
Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае.
 */

public class Task6 {
    static void appurtenant(int x, int y) {
        boolean value = y >= 0 && y <= 4 && x >= -2 && x <= 2 || y >= -3 && y <= 0 && x >= -4 && x <= 4;
        System.out.println(value);
    }

    public static void main(String[] args) {
        appurtenant(-4, 2);
    }
}
