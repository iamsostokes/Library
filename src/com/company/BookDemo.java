package com.company;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {
	// write your code here

//            Create a new class named Book and give it at least (4) properties (such as title, author, number of pages, etc.).:Done
//            Create getter & setter methods for each variable.:Done
//            Create a printDetails() method which will display all available information about a Book object. :Done
//            Create a new class named Library and give it (1) property: an array of Book objects.:Done
//            Library should have a numberOfBooksInLibrary() method which displays how many Books the user has in their Library.
//
//            In a class named BookDemo, give the user (3) options: they can see how many books they have, add a book to their Library, or exit the program.
//            If they choose to add a book, they should be prompted to enter all the necessary details about each book.
//            The user should be able to add as many books as they want, and view the number of books in their library as often as they wish.
//

        Scanner scan = new Scanner(System.in);
        boolean trueOption;
        String newTitle = scan.next();
        String newGenre = scan.next();
        int newNumberOfPages = scan.nextInt();
        boolean newCompletedReading = scan.nextBoolean();

        //creating user input to go into the values of a new book object
        Book newBook = new Book(newTitle, newGenre, newNumberOfPages, newCompletedReading);
        Library[] LibraryInventory = new Library[10];

        System.out.println("Welcome to the my Library.");
        System.out.println("What would you like to do? Enter a number to select your option.");
        System.out.println("1. Check how many books are available.");
        System.out.println("2. Add a book to the Library");
        System.out.println("3 Exit the Library.");
        int pickedOption = scan.nextInt();
        do {
            if (scan.hasNextInt()) {
                int userOption = scan.nextInt();
                trueOption = true;
            } else {
                System.out.println("Sorry that is not a valid option");
                trueOption = false;
                scan.next();
            }
//            if (pickedOption == 1) {
//                for (int i = 0; i < LibraryInventory.length; i++) {
//                    Book
//                }
            }  while (!trueOption);







    }
}
