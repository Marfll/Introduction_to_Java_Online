package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

/*
Дана последовательность действительных чисел а 1 ,а 2 ,..., а п . Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */

public class Task2 {
    static void countZ(double z) {
        double[] arr = {-8.967656981665531, -5.973917622916214, -3.9317664106327506, -2.989437063022706,
                1.4191195264820848, 4.936363096778358, 5.214338693151529, 5.674443952917812, 8.14744909866398,
                8.66812238097588};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (z < arr[i]) {
                arr[i] = z;
                count++;
            }
        }
        System.out.println("Произведено замен: " + count);
    }

    public static void main(String[] args) {
        countZ(5.5323432124);
    }
}
