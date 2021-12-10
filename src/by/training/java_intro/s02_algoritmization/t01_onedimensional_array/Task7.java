package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

/*
Даны действительные числа a1, a2,..., an. Найти max(a1+an, a2+an-1....an+an-n).
 */

public class Task7 {
    public static void main(String[] args) {
        double[] n = {-8.322427, -3.858354, -2.921082, -1.01105, 1.422876, 2.654111, 3.756824, 4.752765};
        double[] a = new double[n.length];
        double firstArg = n[0] + n[n.length - 1];
        double maxSum = 0;

        for (int i = 0; i < n.length; i++) {
            maxSum =Math.max(firstArg,n[i] + n[n.length - 1 - i]);
        }

        System.out.println("Максимум равен: " + maxSum);
    }
}
