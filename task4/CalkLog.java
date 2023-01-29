package HomeWork.HomeWork2.task4;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Date;

public class CalkLog 
{
    public static void main(String[] args) throws SecurityException, IOException 
    {
        int a; 
        int b;
        int res = 0;
        char op;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1е число: ");
        a = sc.nextInt();
        System.out.print("Введите 2е число: ");
        b = sc.nextInt();
        System.out.print("\nВведите оператор (+, -, *, /): ");
        op = sc.next().charAt(0);
        sc.close();

        if (op == '+')     {res = a + b;}
        else if(op == '-') {res = a - b;}
        else if(op == '*') {res = a * b;}
        else if(op == '/') {res = a / b;}
        else System.out.printf("Неверный ввод !");

        System.out.print("\n   Ответ:\n");
        System.out.printf(a + " " + op + " " + b + " = " + res + "\n");

        Date date = new Date();
        
        Logger logger = Logger.getLogger(CalkLog.class.getName());
        FileHandler fh = new FileHandler
        ("c:\\Users\\Ivanov\\Desktop\\Java\\HomeWork\\HomeWork2\\task4\\CalcLog.txt"); 
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        //XMLFormatter xml = new XMLFormatter();
        //fh.setFormatter(xml);

        logger.info(date.toString());
        logger.info("Пользователь ввел 1 число = " + a  + "\nПользователь ввел 2 число = " + b);
        logger.info("Пользователь ввел 2 число = " + b );
        logger.info("Пользователь ввел оператор '" + op + "'" );
        logger.info
        ("Пользователь получил ответ : " + a + " " + op + " " + b + " = " + res + "\n");

        
    } // END MAIN

}
