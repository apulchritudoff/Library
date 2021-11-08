import java.util.ArrayList;

public class Library {

    String Address;
    ArrayList<Book> books = new ArrayList<Book>();

    Library(String Address) {
        this.Address = Address;
    }

    public void addBook(Book book) {
        this.books.add(book);
    } 

    public void printAddress () {
        System.out.println(Address);
    }

    public void borrowBook (String bookName) {
        for (Book book : books) {
            if (book.title.equals(bookName) && book.borrowed == false) {
                book.borrowed();
                System.out.println("Book borrowed");
            }
            if (book.title.equals(bookName) && book.borrowed == true) {
                System.out.println("Book not found");
            }
        }
    }

    public void printAvailableBooks () {
        for (Book book : books) {
            if (book.borrowed == false) {
                System.out.println(book.title);
            }
        }
    }

    public void returnBook (String bookName) {
        for (Book book : books) {
            if (book.title.equals(bookName) && book.borrowed == true) {
                book.returned();
                System.out.println("Book returned");
            }
            else {
              //  System.out.println("Book not found");
            }
        }
    }


} 