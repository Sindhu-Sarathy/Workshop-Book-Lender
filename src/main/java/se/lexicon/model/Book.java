package se.lexicon.model;

import java.util.UUID;

public class Book {
    // todo: needs completion
    private final String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        id=UUID.randomUUID().toString();
        setTitle(title);
        setAuthor(author);
        setAvailable(true);
    }

    public Book(String title, String author, Person borrower) {
        this(title,author);
        setBorrower(borrower);
    }

    public String getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    private void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
        setAvailable(false);
    }

    public String getBookInformation(){
        return String.format("Book Title: %s,Book author: %s,Book available: %b,Book borrower: %s",getTitle(),getAuthor(),isAvailable(),getBorrower()==null?"none":getBorrower().getPersonInformation());
    }
}