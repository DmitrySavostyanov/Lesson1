package tasksPack1;

/* Проверка кратности числа.
    Вводятся два числа (большее и меньшее). Определить, кратно ли первое число
    второму, то есть делится ли первое число нацело на второе. Вывести на экран
    сообщение об этом, а также остаток от деления, если первое число не кратно второму.
Алгоритм решения:
1. Просим ползователя ввести два числа не равных друг другу (создаем запрос на ввод).
2. Сканируем их с помощью метода Сканнер. Сохраняем в переменной.
3. Создаем численную переменную  с именем Кратность куда будем складывать остаток от деления чисел из условия.
4. Пишем логику.
5. Выводим в консоль решение.

*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа не равных друг другу: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int mod = num1 % num2; //остаток от деления

        if (mod == 0) {
            System.out.println("Первое число кратно второму");
            System.out.print("Остаток от деления = " + mod);
        } else if(mod != 0) {
            System.out.println("Первое число не кратно второму");
            System.out.print("Остаток от деления = " + mod);
        }

    }

}


