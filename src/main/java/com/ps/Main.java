package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Book book1 = new Book(1, "978-0-593-20278-4", "Salt to the Sea");
        Book book2 = new Book(2, "978-0-7432-7356-4", "The Road");
        Book book3 = new Book(3, "978-0-316-76969-4", "Gone Girl");
        Book book4 = new Book(4, "978-1-5011-1081-6", "The Outsider");
        Book book5 = new Book(5, "978-0-316-01792-3", "The Book Thief");
        Book book6 = new Book(6, "978-0-345-52865-8", "The Hunger Games");
        Book book7 = new Book(7, "978-0-743-26203-9", "A Game of Thrones");
        Book book8 = new Book(8, "978-0-14-312774-1", "The Goldfinch");
        Book book9 = new Book(9, "978-0-525-57578-7", "Where the Crawdads Sing");
        Book book10 = new Book(10, "978-1-101-87419-4", "The Girl on the Train");
        Book book11 = new Book(11, "978-0-307-38956-3", "The Shack");
        Book book12 = new Book(12, "978-1-5011-5708-8", "The Woman in the Window");
        Book book13 = new Book(13, "978-0-451-52953-2", "The Handmaid's Tale");
        Book book14 = new Book(14, "978-0-743-26203-5", "The Help");
        Book book15 = new Book(15, "978-0-141-18776-1", "1984");
        Book book16 = new Book(16, "978-1-250-03062-8", "Little Fires Everywhere");
        Book book17 = new Book(17, "978-1-4767-2725-0", "Me Before You");
        Book book18 = new Book(18, "978-0-394-82337-9", "Beloved");
        Book book19 = new Book(19, "978-0-425-27624-6", "The Alchemist");
        Book book20 = new Book(20, "978-0-593-31584-2", "The Midnight Library");

        Book[] inventory = new Book[20];
        inventory[0] = book1;
        inventory[1] = book2;
        inventory[2] = book3;
        inventory[3] = book4;
        inventory[4] = book5;
        inventory[5] = book6;
        inventory[6] = book7;
        inventory[7] = book8;
        inventory[8] = book9;
        inventory[9] = book10;
        inventory[10] = book11;
        inventory[11] = book12;
        inventory[12] = book13;
        inventory[13] = book14;
        inventory[14] = book15;
        inventory[15] = book16;
        inventory[16] = book17;
        inventory[17] = book18;
        inventory[18] = book19;
        inventory[19] = book20;


        int mainTheStoreHomeScreenCommand;

        do {
            System.out.println("Welcome to the Neighborhood Library! What would you like to do today?");
            System.out.println("1 - Show available books");
            System.out.println("2 - Show checked out books");
            System.out.println("3 - Exit");

            System.out.print("Enter your command");

            mainTheStoreHomeScreenCommand = scanner.nextInt();

        }



    }
}