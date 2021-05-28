# TMS_Core_AN04

## Lesson 1
Запрещено использование условных операторов ветвления (`if-else` конструкции)

1) В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Добавить решение для дробных чисел.
2) Треугольник существует только тогда, когда сумма любых двух его сторон
больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
стороны предполагаемого треугольника. Требуется сравнить длину каждого
отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
окажется больше суммы двух других, то треугольника с такими сторонами не
существует. Подсказка: используйте тип `boolean` и логические операции с ним: `||` - логическое ИЛИ, `&&` - логическое И
 * `5 > 0 || 5 < 0` - результат `true`
 * `5 > 0 && 5 < 0` - результат `false`
 * `1 > 1 || 2 > 2 || 3 >= 3` - результат `true`
3) Даны 2 числа. Вывести большее из них. Подсказка: используйте `Math.abs(..)` для нахождения модуля числа
4) (*) Даны 3 целых числа. Найти количество положительных чисел в исходном
наборе. Подсказка: используйте `Math.abs(..)` для нахождения модуля числа

## Lesson 2

1.1) Написать программу, которая читает введеное с консоли число. Число должно быть от 1 до 12. 
Напечатать на консоль название месяца, которое соответствует введеному числу (например 1 - Январь)
Если число неправильное (не от 1 до 12), напечатать на консоль сообщение, информирующее об ошибке (например "Неправильное число, должно быть от 1 до 12)
Для считывание числа с консоли используйте
```
Scanner in = new Scanner(System.in);
System.out.print("Введите число: ");
int num = in.nextInt();
//
// работа с числом
//
in.close()
```
2.1) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

3.1) Напишите программу, определяющую сумму всех нечетных чисел от 1
до 99

3.2) Вычислить: 1+2+4+8+...+256

3.3) Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?

4.1) Дано положительное число x (например 1098). Написать программу, которая печатает на консоль все цифры данного числа (используя цикл while)

5.1) Написать программу, которая печатает на консоль прямоугольник из символа "@" длины NxM (задается вручную, т.е. int n = 10; int m = 5, например)
```
@@@@@@@@@@
@@@@@@@@@@
@@@@@@@@@@
@@@@@@@@@@
@@@@@@@@@@
```
5.2) Дано число x, найти все простые числа от 1 до x (число считается простым, если делится только на себя и на 1) 

## Lesson 3
1) Дан произвольный массив чисел<br>
1.1) Найти произведение элементов, кратных 3.<br>
1.2) Найти среднее арифметическое элементов с нечетными номерами.<br>
1.3) Найти средне арифметическое элементов массива, превосходящих некоторое
число С.<br>

2) Дано число n, заполнить массив длинны n случайными числами из отрезка [-15; 17] <br>
2.1) Найти наименьший нечетный элемент.<br>
2.2) Найти второй по максимальности элемент массива (т.е. из чисел 1 2 3 4 - 3 будет вторым по максимальности) <br>
2.3) Найти максимальный элемент массива и поменять его местами с 1-м (0-м по индексу) числом массива <br>

3) Одномерные массивы посложнее <br>
3.1) В произвольно заполненном массиве проверить все ли числа разные <br>
3.2) Дан массив длины n=50, заполненный случайными числами из промежутка [a; b], a=0, b=100, b >= n всегда. Проверить являютя ли все числа в массиве уникальными <br>
3.3*) Оценить сложности алгоритмов для 3.1 и 3.2; 3.2 должен решаться за линейное время <br>
3.4*) Дан массив длины 20, заполненнйы случайнми числами из отрезка [0;5]. Для каждого числа из массива найти его кол-во. Решение за линейное время<br>

4) Пузырек <br>
4.1) Реализовать сортировку пузырьком, в которой мы выталкиваем сначала элемент слева-направо, а затем на обратном пути справа-налево и т.д. (пример был на занятии)

5) Дана квадртная матрица NxN <br>
5.1) Найти максимум на главное диагонали <br>
5.2) Найти сумму элементов на побочной диагонали <br>
5.3) Найти минимальное число из диагонали, стоящей над главной <br>
5.4) Транспонировать матрицу NxM <br>
5.5) Перемножить две произвольные матрицы NxM и MxK (как перемножать матрицы можно погуглить) <br>

6) Для сильно желающих: <br>
6.1) Реализовать простой вариант игры сапёр. <br>
Игрок вводит с клавиатуры 2 числа: x и y координату игрового поля<br>
Игра продолжается, пока игрок не откроет все незаминированные клетки или пока не взорвется<br>
Когда игрок открывает незаминированную клетку, все соседние клетки открываются, если на них нет бомбы<br>
Например:
```
Нажали на клетку 1 1
x x x
x 0 x
x x x

x 0 0
0 0 0
0 0 x

Открылись все клетки, кроме (0;0) и (2;2), т.к. там бомбы
```

