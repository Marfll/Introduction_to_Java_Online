package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

/*
Даны действительные числа а1, а2,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task4 {
    public static void main(String[] args) {
        double[] arr = {-4.967656981665531, -5.973917622916214, -3.9317664106327506, -2.989437063022706, 0,
                1.4191195264820848, 4.936363096778358, 9.214338693151529, -5.674443952917812, 8.14744909866398,
                3.66812238097588};
        int max = 0;
        int min = 0;
        double inter;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            } else if (arr[i] < arr[min]) {
                min = i;
            }
        }
        System.out.println("Максимальное значение в массиве под индексом: " + max + '\n'
                + "Минимальное значение в массиве под индексом: " + min);

        inter = arr[max];
        arr[max] = arr[min];
        arr[min] = inter;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            } else if (arr[i] < arr[min]) {
                min = i;
            }
        }
        System.out.println("Максимальное значение в массиве после замены, под индексом: " + max + '\n'
                + "Минимальное значение в массиве после замены, под индексом: " + min);
    }
}
