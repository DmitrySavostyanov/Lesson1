package tasksPack1;

/*Вычисление площади геометрических фигур.

Написать программу, которая в зависимости от выбора пользователя вычисляет
площадь одной из трех геометрических фигур: прямоугольника, треугольника или круга.
Для вычисления площади прямоугольника вводятся длины двух его сторон, треугольника - трех сторон,
круга - вводится диаметр.

I. Сбор информации. Гуглим формулы вычисления площадей необходимых геом. фигур:
    1. Площадь прямоугольника: area1 = a * b;
    2. Площадь треугольника: area2 =  sqrt(s * (s - a) * (s - b) * (s - c)), где s = (a + b + c) / 2;
    3. Площадь круга: area3 = п * sqr(d)/4;

II. Описание алгоритма решения задачи:
    1.Делаем запрос пользователю на ввод данных (он должен выбрать тип фигуры) в консоли.
    2.Создаем сканнер с целью сохранения вводимых пользователем данных после того как он их ввел с клавиатуры.
    3.Сохраняем отсканированные введенные полезователем данные в переменной.
    4.Выбираем логическую конструкцию для решения задачи.
        4.1. Если пользоваетель выбрал фигуру - круг (программа вычисляет и выводит в консоль инофрмацию
         о том что это круг с area такой-то);
        4.2  Если пользоваетель выбрал фигуру - прямоугольник (программа вычисляет и выводит в консоль
             инофрмацию о том что это прямоугольник с area такой-то);
        4.3. Если пользоваетель выбрал фигуру - треугольник (программа вычисляет и выводит в консоль
             инофрмацию о том что это треугольник с area такой-то);
        4.4. Иначе ошибка
 */

import java.util.Scanner;

import static java.lang.Math.sqrt;

class Task2 {
    public static void main(String[] args) {
        System.out.print("Выберете одну из трех фигур: 1 - прямоугольник, 2 - треугольник, 3 - круг: ");
        Scanner sc = new Scanner(System.in);
        int figNum = sc.nextInt();

        if (figNum == 1) {
            System.out.println("Это прямоугольник!");
            Scanner paramFig1 = new Scanner(System.in);
            System.out.println("Введите длину, см: ");
            int a = paramFig1.nextInt();
            System.out.println("Введите ширину, см: ");
            int b = paramFig1.nextInt();
            int area1 = a * b;
            System.out.printf("Площадь фигуры = " + area1 + "см2");
        } else if (figNum == 2){
            System.out.println("Это треугольник!");
            Scanner paramFig2 = new Scanner(System.in);
            System.out.println("Введите длину стороны 1, см: ");
            int a1 = paramFig2.nextInt();
            System.out.println("Введите длину стороны 2, см: ");
            int b2 = paramFig2.nextInt();
            System.out.println("Введите длину стороны 3, см: ");
            int c3 = paramFig2.nextInt();
            int l = (a1 + b2 + c3)/2;
            double area2 = Math.sqrt(l * (l - a1) * (l - b2) * (l - c3)); // формула Герона. Вопрос?
          System.out.printf("Площадь фигуры = " + area2 + "см2");

       }
        else if (figNum == 3) {
            System.out.println("Это круг!");
            Scanner paramFig3 = new Scanner(System.in);
            System.out.println("Введите диаметр окружности: ");
            int d = paramFig3.nextInt();
            double pi = 3.14;
            double area3 = pi * (d * 2)/4;
            System.out.printf("Площадь фигуры = " + area3 + "см2");
        }

        else {
            System.out.printf("Ошибка");
        }
   }
}