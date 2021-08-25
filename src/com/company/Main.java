package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int NUM = 0;
        String word = " number ";
        String my_homework = NUM + word;
        System.out.println(my_homework);

        if (NUM < 0) {
            System.out.println("Вы сохронили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохронили положительное число");
        } else {
            System.out.println("Вы сохронили ноль");
        } // Задание на сообразительность
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте скажите мне своё имя");
        String string = scanner.nextLine();
        System.out.println("Здравствуйте " + string);

    }
}
