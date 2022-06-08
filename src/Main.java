import bridge.abstraction.Manuscript;
import bridge.bridge.AcademiaFormatter;
import bridge.bridge.StandardForammter;
import bridge.implementation.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manuscript book = new Book(new StandardForammter(), "Brave New World", "If one's different, one's bound to be lonely");
        Manuscript paper = new Book(new AcademiaFormatter(), "Garbage", "Long formatted garbage");

        List<Manuscript> manuscripts = new ArrayList<>(Arrays.asList(new Manuscript[] {book, paper}));

        for (Manuscript s : manuscripts) {
            s.print();
        }
    }
}