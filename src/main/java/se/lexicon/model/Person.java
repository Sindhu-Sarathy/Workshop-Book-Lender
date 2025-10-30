package se.lexicon.model;

import java.util.Arrays;

public class Person {
    // todo: needs completion
    private static int sequencer=0;
    private int id;
    private String firstName;
    private String lastName;
    private Book[] borrowed =new Book[0];

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

    public Book[] getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Book[] borrowed) {
        this.borrowed = borrowed;
    }

    public void loanBook(Book book){
            if(book.isAvailable()){
                book.setBorrower(this);
                Book[] newArray= Arrays.copyOf(borrowed,borrowed.length+1);
                newArray[newArray.length-1]=book;
                setBorrowed(newArray);
            }
            else{
                throw new RuntimeException("The Book is not available!");
            }
    }

    public void returnBook(Book book){
        Book[] newBorrowed=new Book[borrowed.length-1];
        for(int i=0,j=0;i< borrowed.length;i++){
            if(borrowed[i].getId().equals(book.getId())){
                newBorrowed[j]=borrowed[i];
                j++;
            }
        }

        if(newBorrowed.length < borrowed.length){
            book.setBorrower(null);
            borrowed=newBorrowed;
        }
        else{
            throw new RuntimeException("The book was not borrowed");
        }
    }

    public String getPersonInformation(){
        return String.format("Firstname: %s,Lastname: %s,Borrowed Books: %s",getFirstName(),getLastName(),Arrays.toString(borrowed));
    }
}