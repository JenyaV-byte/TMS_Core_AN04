package Lesson3;
/*
Дан произвольный массив чисел
1.1) Найти произведение элементов, кратных 3.
1.2) Найти среднее арифметическое элементов с нечетными номерами.
1.3) Найти средне арифметическое элементов массива, превосходящих некоторое число С.
 */

public class Les3HomeWorkTask1 {
    public static void main(String[] args) {
        int n=20;
        int j =0;
        int[] mass=new int[n];
        for (int i=0;i<n;i++)
            if (mass[i]%3==0);
            j=j+mass[i]; // не понимаю как присвоить значение...(
            System.out.println("Сумма"+j);
    }

}
