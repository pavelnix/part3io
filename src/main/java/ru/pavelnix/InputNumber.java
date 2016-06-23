package ru.pavelnix;

import java.util.Scanner;

/**
 * Класс для ввода числа
 */
public class InputNumber {

    public static void main(String[] args) {
        new InputNumber().start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        if (scanner.hasNextInt()) {
            if (new EvenOdd(scanner.nextInt()).checkEvenOdd()) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
