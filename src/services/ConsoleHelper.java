package services;

import java.util.Scanner;

public class ConsoleHelper {

    private static final Scanner scanner = new Scanner(System.in);

    public static void writeCurrentState(int amount) {
        System.out.format("На столе осталось %d спичек.\n", amount);
        if (amount != 20) {
            System.out.print(" - Ход игрока. Выберите количество спичек: ");
        }
    }

    public static int readTurn() {
        return scanner.nextInt();
    }

    public static void writeIncorrectAmount() {
        System.out.println("Некорректное количество спичек!");
    }

    public static void writeGameOver() {
        System.out.println("Для игрока осталась последняя спичка! Игрок проиграл!");
    }

    public static void writeBotTurn(int turn) {
        System.out.println(" - Количество выбранных компьютером спичек: " + turn);
    }
}
