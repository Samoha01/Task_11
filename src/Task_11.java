/*
   Задание № 11
 Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
 */

import java.util.Scanner;
public class Task_11 {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String X = scan.nextLine();
        System.out.println("Введенный вами текст: " + X);

    }
}