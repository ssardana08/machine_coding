package com.sumit.wallet;

import com.sumit.wallet.services.WalletService;

import java.util.Scanner;

public class Main {

    private static String menu() {
        return "1. Create Wallet \n" +
                "2. Overview\n" +
                "3. Exit\n";
    }
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter their name
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        // Prompt the user to enter their age
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        // Display the entered name and age
//        System.out.println("Hello, " + name + "! You are " + age + " years old.");
//
//        // Close the scanner
//        scanner.close();

        System.out.println("Welcome to digital wallet");
        WalletService service = new WalletService();
        Scanner input = new Scanner(System.in);

        boolean flag = true;
        while (flag){
            System.out.println(menu());
            int select = input.nextInt();
            switch (select) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Amount: ");
                    double amount = scanner.nextDouble();

                    service.createWallet(name, amount);
                    break;
                case 2:
                    service.getOverview();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        input.close();
    }
}
