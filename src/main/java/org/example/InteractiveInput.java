package org.example;

import org.example.convert.*;

import java.util.Scanner;

public class InteractiveInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coin = 0;

        while (true) {
            try {


            } catch (IllegalArgumentException)
            coin = scanner.nextInt();
            double amountInDollars = ConvertRUB.convert(coin, Currency.RUB, Currency.DOLLAR);
            System.out.println(amountInDollars);
        }
    }
}