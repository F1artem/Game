package com.company;


import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 10");
        System.out.println("У вас есть 3 попытки!");
        int compNumber = random();
        int count = 0;
        while (count < 3) {
            int humNumber = scan();
            if (humNumber == compNumber) {
                System.out.println("Верно");
                break;
            } else if (humNumber != compNumber) {
                System.out.println("Не верно");
                count++;
            }
        }
        System.out.println("Правильный ответ: " + compNumber);
    }

    public static int random() {
        Random newRandom = new Random();
        int randoNumber = newRandom.nextInt(11) + 1;
        return randoNumber;
    }

    public static int scan () {
        System.out.print("Число : ");
        Scanner scanner = new Scanner(System.in);
        int humanNumber = scanner.nextInt();
        return humanNumber;
    }
}
