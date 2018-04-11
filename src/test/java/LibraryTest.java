import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book();
    }

    @Test public void libraryHasNoBooks() {
        assertEquals(0, library.countOfBooks());
    }
}
