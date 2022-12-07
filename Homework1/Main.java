package Homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задача1
        // System.out.print("Введите число: ");
        // Scanner enterNumber = new Scanner(System.in);
        // Integer n = enterNumber.nextInt();
        // System.out.println(findFactorial(n));


        // Задача2
        // getPrimeNumbers();


        // Задача3
        // calculator();

    }


    /**
     * Задача1
     * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
     */
    public static int findFactorial(int n) {
        int result = 1;
		for (int i = 1; i <= n; i ++){
			result = result * i;
		}
		return result;
    }


    /**
     * Задача2
     * Вывести все простые числа от 1 до 1000
     */
    public static void getPrimeNumbers() {
        int n = 1000;

        for (int i = 2; i < n; i++) {
            boolean a = true;

            int m = (int) Math.sqrt(i);

            for (int j = 2; j <= m; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i + " ");
            }
        }
    }


    /**
     * Задача3
     * Реализовать простой калькулятор
     */
    public static void calculator() {
        int num1;
        int num2;
        int result;
        char operation;
        Scanner reader = new Scanner(System.in);
      System.out.print("Введите первое число: ");
      num1 = reader.nextInt();
      System.out.print("Введите второе число: ");
      num2 = reader.nextInt();
      System.out.print("Введите оператор (+, -, *, /): ");
      operation = reader.next().charAt(0);
      switch(operation) {
         case '+': result = num1 + num2;
            break;
         case '-': result = num1 - num2;
            break;
         case '*': result = num1 * num2;
            break;
         case '/': result = num1 / num2;
            break;
         default:  
            return;
       }
      System.out.print("\nРезультат:\n");
      System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
