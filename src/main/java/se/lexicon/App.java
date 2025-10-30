package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        // todo: needs completion

        // Create a book instance
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        Book book2 = new Book("The Fellowship of the Ring", "J.K. Rowling");

        // Display book information
        System.out.println("=== INITIAL BOOK INFORMATION ===");
        System.out.println("Book 1: " + book1.getBookInformation());
        System.out.println("Book 2: " + book2.getBookInformation());
        System.out.println();


        // Create a person instance
        Person person1 = new Person("Mohamad", "Nour");

        // Display person information
        System.out.println("=== BORROWING PERSON INFORMATION ===");
        System.out.println("Person 1: " + person1.getPersonInformation());
        System.out.println();


        // Loan a book to the person
        System.out.println("=== BORROWING BOOKS ===");
        person1.loanBook(book1);
        person1.loanBook(book2);
        System.out.println();


        // Display person information after borrowing a book
        System.out.println("=== AFTER BORROWING ===");
        System.out.println("Person 1: " + person1.getPersonInformation());

        // Display book information after borrowing a book
        System.out.println("Book 1: " + book1.getBookInformation());
        System.out.println("Book 2: " + book2.getBookInformation());
        System.out.println();

        // Return the borrowed book
        System.out.println("=== RETURNING BOOKS ===");
        person1.returnBook(book1);
        System.out.println();


        // Display person information after returning the book
        System.out.println("=== AFTER RETURNING BOOKS ===");
        System.out.println("Person: " + person1.getPersonInformation());




        // Display book information after borrowing a book
        System.out.println("Book 1: " + book1.getBookInformation());
        System.out.println("Book 2: " + book2.getBookInformation());

    }

}
