package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion

        // Create a book instance
        //Book book =new Book("Pride and Prejudice","Jane Austin");
        Book book =new Book("Pride and Prejudice","Jane Austin");
        // Display book information
        System.out.println(book.getBookInformation());

        // Create a person instance
        Person person=new Person("Sindhuja","Parthasarathy");
        // Display person information
        System.out.println(person.getPersonInformation());

        // Loan a book to the person
        person.loanBook(book);
        // Display person information after borrowing a book
        System.out.println(book.getBookInformation());
        // Display book information after borrowing a book
        System.out.println(person.getPersonInformation());

        // Return the borrowed book
        person.returnBook(book);

        // Display person information after returning the book
        System.out.println(book.getBookInformation());
        // Display book information after borrowing a book
        System.out.println(person.getPersonInformation());

    }

}
