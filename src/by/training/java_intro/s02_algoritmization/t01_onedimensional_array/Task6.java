package by.training.java_intro.s02_algoritmization.t01_onedimensional_array;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел,порядковые номера которых
являются простыми числами.
 */

public class Task6 {
    public static void main(String[] args) {
        double[] n = {-4.322427, -3.858354, -2.121082, -1.01105, 1.422876, 2.654111, 3.756824, 4.752765};
        double sum = 0;

        for (int i = 0; i < n.length; i++){
            if(isPrimeNumber(i)){
                sum += n[i];
            }
        }
        System.out.println("Сумма веществинных чисел с простым порядковым номером: " + sum);
    }

    public static  boolean isPrimeNumber (int i){
        int factors =0;
        int j = 1;

        while (j <= i){
            if (i % j == 0){
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }
}
