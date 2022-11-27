import java.util.Scanner;

/** Задача №1
 Мы хотим, чтоб пользователь ввёл в консоль любое целое число от 1 до 3,
 а программа вывела ему ответ, какое именно число он ввёл. **/
/*
public class Training {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число от 1 до 3: ");
        Scanner s = new Scanner(System.in);//создаем сканнер
        int num = s.nextInt(); //подключаем метод "nextInt"  - действие которого заключается в том, что
        // система делает дествие ---> забирает ввденное пользователем число в переменную "к"
        System.out.println("Вы ввели число: " + num);
    }
}

*/
/** Задача №2
 Мы хотим, чтоб пользователь ввёл в консоль два любых целых числа от 1 до 3,
 а программа вывела ему ответ, какое именно число он ввёл. **/
/*
public class Training {

    public static void main(String[] args) {
        System.out.print("Введите два любых целых числа от 1 до 3: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);

    }

}
*/

/** Задача №3
Необходимо написать программу, где бы пользователю предлагалось ввести число на
выбор: 1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
**/
/*
public class Training {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 3: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("Ввели число: 1");
        } else if (num == 2) {
            System.out.println("Вы ввели число: 2");
        } else if (num == 3) {
            System.out.println("Вы ввели число: 3");
        } else {
            System.out.println("Вы ввели число вне диапазона от 1 до 3");
        }
    }
}
*/

/**Задача №4
Необходимо написать программу, где бы пользователю предлагалось ввести число  1.
Если пользователь ввёл число 1, программа должна вывести сообщение: "Вы ввели число 1".
Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 1" **/
/*
public class Training {
    public static void main(String[] args) {
        System.out.println("Введите целое число - 1: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("Вы ввели целое число 1");
        }else{
            System.out.println("Вы ввели целое число не равное 1");
        }
    }
}
*/

/**Задача №5
 Найти максимальное число из трех.
 Определить какое из трех введенных пользователем чисел максимальное и вывести его на экран. **/
public class Training {
    public static void main(String[] args) {
        System.out.print("Введите три целых числа");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3)
                System.out.println("numMax: " + num1);
        } else if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("numMax: " + num2);
            } else if (num3 > num1) {
                if (num3 > num1)
                    if (num3 > num2) {
                        System.out.println("numMax: " + num3);
                    }
            }

        }

    }

}




