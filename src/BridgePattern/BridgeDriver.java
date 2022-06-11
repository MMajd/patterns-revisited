package BridgePattern;

import driver.PatternDriver;

import java.util.*;

import BridgePattern.abstraction.*;
import BridgePattern.bridge.*;
import BridgePattern.implementation.*;

public class BridgeDriver implements PatternDriver {

    @Override
    public void run() {
        System.out.println();

        Manuscript book = new Book(new StandardForammter(), "Brave New World",
                "If one's different, one's bound to be lonely");
        Manuscript paper = new ResearchPaper(new AcademicFormatter(), "Garbage", "Long formatted garbage");

        List<Manuscript> manuscripts = new ArrayList<>(Arrays.asList(new Manuscript[] { book, paper }));

        for (Manuscript s : manuscripts) {
            s.print();
        }
    }
}