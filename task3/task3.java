package HomeWork.HomeWork2.task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        //Напишите метод, который принимает на вход строку (String) 
        // и определяет является ли строка палиндромом (возвращает boolean значение).
        // последняя строчка была намеком на метод внутри метода :D
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String StrokaConsole = sc.nextLine();
        sc.close();
        System.out.println("Ответ: " + Palindrome(StrokaConsole));
    }
    public static Boolean Palindrome(String stroka) 
    {
        return stroka.equals((new StringBuilder(stroka)).reverse().toString());
    }
}