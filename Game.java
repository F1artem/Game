package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int compNumber = random();
        int humNumber = scan();
        int count = 0;
        while (true) {
            if (humNumber == compNumber) {
                System.out.println("Вы выиграли");
                break;
            } else if (humNumber != compNumber) {
                System.out.println("Не верно");
                break;
            }

        }

        public static int random () {
            Random newRandom = new Random();
            int randoNumber = newRandom.nextInt(11) + 1;
            return randoNumber;
        }

        public static int scan () {
            System.out.println("Введите число от 1 до 10");
            System.out.println("Внимание!!! У вас всего три попытки");
            System.out.print("Ваше число: ");
            Scanner scanner = new Scanner(System.in);
            int humanNumber = scanner.nextInt();
            return humanNumber;
        }
    }
}


