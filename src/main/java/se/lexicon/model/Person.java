package se.lexicon.model;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Person {
    // todo: needs completion

    private static int  seguence = 0;
    private int id;
    private String firstName;
    private String lastName;
    private List<Book> borrowedBooks;



    public Person(String firstName, String lastName) {
        this.id = this.getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = new ArrayList<>();
    }
    private int getNextId() {
        return ++seguence;
    }
    //Setters and Getters
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            book.setBorrower(this);
            borrowedBooks.add(book);
            System.out.println(firstName + " borrowed book: " + book.getTitle());

        } else  {
            System.out.println("Book is already borrowed: " + book.getTitle());
        }

    }
    public void returnBook(Book book) {
        if(borrowedBooks.contains(book)) {
            book.setAvailable(true);
            book.setBorrower(null);
            borrowedBooks.remove(book);
            System.out.println(firstName + " returned book: " + book.getTitle());
        }
        else {
            System.out.println("This person hasn't borrowed this book: " + book.getTitle());
        }
    }
    public String getPersonInformation() {
    return "Person ID: " + id +
            ", Name: " + firstName + " " + lastName + ", Number of borrowed books: " + borrowedBooks.size();


    }


// Constructors


}