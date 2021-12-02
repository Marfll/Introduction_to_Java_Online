package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

import java.util.Random;

public class Task1 {
    static void sumArray(int k) {
        int[] arr = new int[10];
        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов кратных " + k + ": " + sum);
    }

    public static void main(String[] args) {
        sumArray(4);
    }
}
