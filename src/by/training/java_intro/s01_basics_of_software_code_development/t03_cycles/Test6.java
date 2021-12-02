package by.training.java_intro.s01_basics_of_software_code_development.t03_cycles;

/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Test6 {
    public static void main(String[] args) {
        char[] array = {'q', 'w', 'e', 'r', 't'};

        for (char c : array)
            System.out.println(c + " - " + (int) c);
    }
}
