package ru.task2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        doGuessing();
    }

    static void doGuessing() {
        System.out.println("Загадайте любое целое число от 0 до 9, у вас есть 3 попытки");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int randomNumber = (int)(Math.random() * 10);
        for(int i = 1; i < 3; i++) {
            if(number > randomNumber) {
                System.out.println("Загаданное вами число больше");
                number = scanner.nextInt();
            }
            if(number < randomNumber) {
                System.out.println("Загаданное вами число меньше");
                number = scanner.nextInt();
            }
            if(i == 2 && number != randomNumber) {
                System.out.println("Вы проиграли!");
                System.out.println("Повторить игру еще раз? 1 - да / 0 - нет ");
                int choosingNumber = scanner.nextInt();
                if(choosingNumber == 1) {
                    doGuessing();
                }
            }
            if(number == randomNumber) {
                System.out.println("Вы угадали! Поздравляю!");
                System.out.println("Повторить игру еще раз? 1 - да / 0 - нет ");
                int choosingNumber = scanner.nextInt();
                if(choosingNumber == 1) {
                    doGuessing();
                }
            }
        }
    }
}