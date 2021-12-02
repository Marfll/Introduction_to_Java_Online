package by.training.java_intro.s01_basics_of_software_code_development.t02_branching;

/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
 */

public class Task4 {
    static void brickInTheHole(int[] hole, int[] brick) {

        int squareHole = hole[0] * hole[1];
        int squareBrick1 = brick[0] * brick[1];
        int squareBrick2 = brick[0] * brick[2];
        int squareBrick3 = brick[1] * brick[2];
        if (squareHole >= squareBrick1 || squareHole >= squareBrick2 || squareHole >= squareBrick3) {
            System.out.println("Кирпич проходит через отверстие.");
        } else {
            System.out.println("Кирпич не проходит через отверстие.");
        }
    }

    public static void main(String[] args) {

        brickInTheHole(new int[]{3, 2}, new int[]{4, 2, 5});
    }
}
