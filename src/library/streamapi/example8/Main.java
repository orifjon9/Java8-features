package library.streamapi.example8;

import java.util.List;

/**
 * Created by orifjon9 on 3/18/2017.
 */
public class Main {
    public static void main(String[] args){
        Book book = new Book("test", 3);
        List<BookCopy> bookCopyList = book.getCopies();

        System.out.println(book.isAvailable());

        bookCopyList.forEach(bookCopy -> bookCopy.changeAvailability());

        System.out.println(book.isAvailable());

    }
}
