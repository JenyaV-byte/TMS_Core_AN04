package Lesson2;
        /* Написать программу, которая читает введеное с консоли число.
        Число должно быть от 1 до 12. Напечатать на консоль название месяца, которое соответствует введеному числу (например 1 - Январь)
        Если число неправильное (не от 1 до 12), напечатать на консоль сообщение, информирующее об ошибке (например "Неправильное число,
        должно быть от 1 до 12) Для считывание числа с консоли используйте
 */

import java. util. Scanner;

public class Lesson2HomeWorkTask1 {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
                int num = in.nextInt();
                switch (num) {
                case 1: {
                System.out.println("Январь");
                break;
                }
                case 2: {
                System.out.println("Февраль");
                break;
                }
                case 3: {
                System.out.println("Март");
                break;
                }case 4: {
                System.out.println("Аперль");
                break;
                }
                case 5: {
                System.out.println("Май");
                break;
                }
                case 6: {
                System.out.println("Июнь");
                break;
                }
                case 7: {
                System.out.println("Июль");
                break;
                }
                case 8: {
                System.out.println("Август");
                break;
                }
                case 9: {
                System.out.println("Сентябрь");
                break;
                }case 10: {
                System.out.println("Октябрь");
                break;
                }
                case 11: {
                System.out.println("Ноябрь");
                break;
                }
                case 12: {
                System.out.println("Декабрь");
                break;
                }
                    default: {
                        System.out.println("Неправильное число, должно быть от 1 до 12");
                    }
                }
            in.close();
    }

}