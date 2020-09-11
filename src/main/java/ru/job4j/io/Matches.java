package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int matches = 11;
        while (matches > 0) {
            System.out.print("Игрок - 1 введите число от 1 до 3: ");
            int numPlayer1 = Integer.valueOf(inp.nextLine());
            if (numPlayer1 < 1 || numPlayer1 > 3) {
                System.out.println("Неверное число, вы потеряли ход!");
            } else {
                matches -= numPlayer1;
                if (matches < 0) break;
                System.out.println("Осталось " + matches + " спичек");
            }


            System.out.print("Игрок - 2 введите число от 1 до 3: ");
            int numPlayer2 = Integer.valueOf(inp.nextLine());
            if (numPlayer2 < 1 || numPlayer2 > 3) {
                System.out.println("Неверное число, вы потеряли ход!");
            } else {
                matches -= numPlayer2;
                if (matches < 0) break;
                System.out.println("Осталось " + matches + " спичек");
            }
        }

        System.out.println("Игра окончена");
    }
}
