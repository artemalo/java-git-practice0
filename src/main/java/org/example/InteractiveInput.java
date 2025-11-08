package org.example;

import org.example.convert.*;

import java.util.Scanner;

public class InteractiveInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printMenu();

        boolean running = true;

        while (running) {
            try {
                System.out.print("\nВыберите операцию (1-2): ");
                int choice = scanner.nextInt();
                System.out.print("Введите сумму: ");
                double coin = Double.parseDouble(scanner.next());

                double result;
                String operation;
                switch (choice) {
                    case 1:
                        result = ConvertRUB.convert(coin, Currency.RUB, Currency.DOLLAR);
                        operation = "RUB -> USD";
                        break;
                    case 2:
                        result = ConvertRUB.convert(coin, Currency.DOLLAR, Currency.RUB);
                        operation = "RUB -> USD";
                        break;
                    default:
                        System.out.println("Неверный выбор!");
                        continue;
                }

                System.out.printf("%s: %.2f -> %.2f%n", operation, coin, result);
            } catch (ConvertException e) {
                System.out.println("Ошибка при ковертации: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Неизвестная ошибка: " + e.getMessage());
            } finally {
                System.out.println("Попробуйте снова...");
            }
        }
    }

    private static void printMenu() {
        System.out.println("=== static КОНВЕРТЕР ВАЛЮТ ===");
        System.out.println("1. RUB -> USD");
        System.out.println("2. USD -> RUB");
    }

}