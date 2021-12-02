package by.training.java_intro.s01_basics_of_software_code_development.t02_branching;

/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
 */

public class Task1 {
    static void angle(int a, int b) {
        if (a + b < 180) {
            if (a + b == 90) {
                System.out.println("Треугольник прямоугольный.");
            } else {
                System.out.println("Это треугольник.");
            }
        } else {
            System.out.println("Это не треугольник.");
        }
    }

    public static void main(String[] args) {
        angle(30, 149);
    }
}
