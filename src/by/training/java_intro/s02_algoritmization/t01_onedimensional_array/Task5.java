package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

/*
Даны целые числа а1, а2,..., аn. Вывести на печать только те числа, для которых а i > i.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] a = {-85, -65, -27, -5, 0, 14, 25, 46, 67, 80};
        int i = -30;
        String b = "";

        for (int j : a) {
            if (j > i) {
                b += Integer.toString(j) + " ";
            }
        }
        System.out.println("Числа, больше " + i + ":");
        System.out.print(b);
    }
}
