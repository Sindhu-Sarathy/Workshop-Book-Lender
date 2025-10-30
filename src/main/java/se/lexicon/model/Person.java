package se.lexicon.model;

public class Person {
    // todo: needs completion
    private static int sequencer=0;
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books=new Book[0];

    public Person(String firstName,String lastName) {
        this.id = getNextId();
        setFirstName(firstName);
        setLastName(lastName);
    }

    private static int getNextId(){
            return sequencer++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void loanBook(){

    }

    public String getPersonInformation(){
        return "";
    }
}