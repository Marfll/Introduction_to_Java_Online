package by.training.java_intro.s01_basics_of_software_code_development.t02_branching;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Task3 {
    static void isPointsOnLine(int[] x, int[] y) {
        if (x[2] * (y[1] - y[0]) - y[2] * (x[1] - x[0]) == x[0] * y[1] - x[1] * y[0]) {
            System.out.println("Точки лежат на одной прямой.");
        } else {
            System.out.println("Точки не лежат на одной прямой.");
        }
    }

    public static void main(String[] args) {
        isPointsOnLine(new int[]{1, 2, 3}, new int[]{1, 2, 1}); //point coordinates
    }
}
