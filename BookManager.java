package week12IndividualWork;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }


    // public void setBooks(ArrayList<Book> books) {
    //    this.books = books;
  //  }
}
