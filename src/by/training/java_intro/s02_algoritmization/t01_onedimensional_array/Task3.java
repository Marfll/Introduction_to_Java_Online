package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

public class Task3 {
    static void countNumbers() {
        double[] arr = {-8.967656981665531, -5.973917622916214, -3.9317664106327506, -2.989437063022706, 0,
                1.4191195264820848, 4.936363096778358, 5.214338693151529, -5.674443952917812, 8.14744909866398,
                8.66812238097588};
        int countM = 0;
        int countN = 0;
        int countP = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0)
                countM++;
            if (arr[i] == 0)
                countN++;
            if (arr[i] > 0)
                countP++;
        }
        System.out.println("Колличество отрицательных чисел в массиве: " + countM);
        System.out.println("Колличество нулевых чисел в массиве: " + countN);
        System.out.println("Колличество положительных чисел в массиве: " + countP);
    }

    public static void main(String[] args) {
        countNumbers();
    }
}
