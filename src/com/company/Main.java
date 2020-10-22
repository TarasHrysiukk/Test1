package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        /*Перевірка чи входить символ "3" у увадрат числа n*/
        int n = (int) (Math.random()*10000);
        int nn =n*n;
        System.out.println("Число n = " + n);
        System.out.println("Квадрат числа n = " + nn);
        String str = Integer.toString(nn);

        System.out.println("Символ \"3\" є у квадраті числа n? Відповідь : " + str.contains("3"));
        System.out.println("");
        /*Vіняємо порядк цифр у квадраті числа n*/

        System.out.println("Міняю порядок цифр числа " + str);
        String reversestr = new StringBuffer(str).reverse().toString();
        System.out.println("Новий порядок цифр : " + reversestr);



    }
}
