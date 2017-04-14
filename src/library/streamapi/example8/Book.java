package library.streamapi.example8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by orifjon9 on 3/18/2017.
 */

@SuppressWarnings("unused")
public class Book {
    private List<BookCopy> copies = new ArrayList<BookCopy>();
    private String title;

    private Function<List<BookCopy> ,Stream<BookCopy>> bookCopies = (copies) -> copies.stream()
            .filter(f->f.isAvailable());

    /*
    BiFunction<List<BookCopy>,BookCopy, List<BookCopy>> combiner = (x,y) -> {
        x.add(y);
        return x;
    };
    private Function<List<BookCopy> ,List<BookCopy>> bookCopies = (copies) -> copies.stream()
            .filter(f->f.isAvailable())
            .reduce(new ArrayList<BookCopy>(), (x, y) -> {
                List<BookCopy> list = new ArrayList<BookCopy>(x);
                list.add(y);
                return list;
            });
*/
    public Book(String title, int numCopies) {
        if(numCopies < 1) throw new IllegalArgumentException(
                "NumCopies must be positive");
        this.title= title;
        for(int i = 0; i < numCopies; ++i) {
            addCopy();
        }
    }
    public List<BookCopy> getCopies() {
        return copies;
    }

    public void addCopy() {
        BookCopy copy = new BookCopy(this, copies.size() + 1, true);
        copies.add(copy);
    }

    public boolean isAvailable() {
        //return bookCopies.apply(copies).count() > 0;
        return copies.stream().map(m -> m.isAvailable()).reduce(false, (x, y) -> x || y);

    }
}
