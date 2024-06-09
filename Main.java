package week12IndividualWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static BookManager bookManager = new BookManager();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            System.out.println("Press 1 to add a book");
            System.out.println("Press 2 to show the books");
            System.out.println("Press 3 to remove a book");
            System.out.println("For exit press 4");
            var userInput = sc.nextLine();
            if (userInput.equals("4")) {
                System.out.println("exiting");
                break;
            }
            switch (userInput) {
                case "1":
                    System.out.println("adding the book");
                    createBookToAdd();
                    break;
                case "2":
                    System.out.println("This is a list of books:");
                    listOfBooks();
                    break;
                case "3":
                    System.out.println("removing book");
                    removeBook();
                    break;
                default:
                    System.out.println("something went wrong! Try again");

            }
        }
    }

    public static void createBookToAdd() {
        System.out.println("write the title");
        var title = sc.nextLine();
        System.out.println("write the author");
        var author = sc.nextLine();
        System.out.println("how many pages are in the book? ");
        var pages = sc.nextInt();
        sc.nextLine();
        System.out.println("write a little description");
        var description = sc.nextLine();

        var book = new Book(title, author, pages, description);
        bookManager.addBook(book);

    }

    public static void listOfBooks() {
        ArrayList<Book> books = bookManager.getBooks();
        for (var book : books) {
            System.out.println("title: " + book.getTitle() + ", author: " + book.getAuthor() + ", pages in book: " + book.getPages() + ", description: " + book.getDescription());
        }
    }

    public static void removeBook() {
        System.out.println("write the book's title, to remove from the list: ");
        var title = sc.nextLine().toLowerCase();
        ArrayList<Book> books = bookManager.getBooks();
        books.removeIf(book -> book.getTitle().toLowerCase().equals(title));
        System.out.println("Book removed if it existed.");
    }
}

