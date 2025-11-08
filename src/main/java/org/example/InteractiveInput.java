package org.example;

import org.example.convert.*;

import java.util.Scanner;

public class InteractiveInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coin = 0;

        while (true) {
            try {
                coin = scanner.nextInt();
                double amountInDollars = ConvertRUB.convert(coin, Currency.RUB, Currency.DOLLAR);
                System.out.println(amountInDollars);
            } catch (IllegalArgumentException e) {
                System.out.println("Возникла ошибка: " + e.getMessage());
                System.out.println("Попробуйте снова...");
            }
        }
    }
}