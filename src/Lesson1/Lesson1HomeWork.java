//package Lesson1;
//
//public class Lesson1HomeWork {
//    public static void main(String[] args) {
//        /**
//         * 1) В переменную записываем число. Надо вывести на экран сколько в этом
//         * числе цифр и положительное оно или отрицательное. Например, "это
//         * однозначное положительное число". Достаточно будет определить, является ли
//         * число однозначным, "двухзначным или трехзначным и более.
//         * */
//        int a = -311;
//        // вывод на экран
//        System.out.println("Текст на экран");
//        boolean isGreaterThanZero = a >= 0;
//        System.out.println("Число a больше 0: " + isGreaterThanZero);
//
//        // Первый способ (более простой в реализации)
//
//        // привели "a" к положительному числу (вызвали метод abs и передали аргументом переменную "a")
//        // сделали для того, чтобы избавиться от минуса
//        //a = Math.abs(a);
//
//        // Integer.toString() - мы вызвали метод toString(..) с параметром "a" у класса Integer
//        String aStr = Integer.toString(a);
//
//        // получаем длину строки методом length();
//        int length = aStr.length();
//
//        // печатаем на консоль
//        System.out.println(length);
//
//        // advanced вариант 1-го задания
//        // А что будет, если число не целое?
//        // Задача: написать код, который правильно считает кол-во цифр в дробном числе
//        // а) Считаем все цифры в числе (дробную часть тоже)
//        // б) (посложнее) - считаем только цифры целой части
//
//
//
//        // WQEWQEQ
//        //Q WEQW FQWFq
//
//        double newNumber = 2.7;
//        System.out.println((double) newNumber);
//        System.out.println(newNumber);
//        System.out.println((int) newNumber);
//        String aStr;
//        aStr = Integer.toString((int) newNumber);
//        double length = aStr.length();
//        System.out.println(length);
//        boolean nextCondition = newNumber >= 0;
//        System.out.println(nextCondition);
//
//
//
//
//        int numberA = 3;
//        double numberB = -5.4;
//        numberA = Math.abs(numberA);
//        numberB = Math.abs(numberB);
//        boolean isGreater = Math.abs(numberA) >= Math.abs(numberB);
//        System.out.println(isGreater);
//
//    }
//}
