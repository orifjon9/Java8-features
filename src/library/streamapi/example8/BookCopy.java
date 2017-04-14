package library.streamapi.example8;

/**
 * Created by orifjon9 on 3/18/2017.
 */
@SuppressWarnings("unused")
public class BookCopy {
    private Book book;
    private int copyNum;
    private boolean isAvailable;

    public BookCopy(Book book, int copyNum, boolean isAvailable) {
        this.book = book;
        this.copyNum = copyNum;
        this.isAvailable = isAvailable;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void changeAvailability() {
        isAvailable = !isAvailable;
    }
}
