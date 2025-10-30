package se.lexicon.model;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    // Constructor for available book
    public Book(String title, String author) {
        this.id = generateId();
        this.title = title;
        this.author = author;
        this.available = true;
        this.borrower = null;
    }

    // Constructor for book with borrower
    public Book(String title, String author, Person borrower) {
        this.id = generateId();
        this.title = title;
        this.author = author;
        this.available = false;
        this.borrower = borrower;
    }

    private String generateId() {
        return "B" + System.currentTimeMillis();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public Person getBorrower() {
        return borrower;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public String getBookInformation() {
        String status = available ? "Available" : "Borrowed by: " +
                (borrower != null ? borrower.getFirstName() + " " + borrower.getLastName() : "Unknown");
        return "Book ID: " + id +
                ", Title: " + title +
                ", Author: " + author +
                ", Status: " + status;
    }
}