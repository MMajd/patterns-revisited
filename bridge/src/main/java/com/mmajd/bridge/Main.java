package com.mmajd.bridge;

import com.mmajd.bridge.abstraction.Manuscript;
import com.mmajd.bridge.bridge.AcademicFormatter;
import com.mmajd.bridge.bridge.StandardForammter;
import com.mmajd.bridge.implementation.Book;
import com.mmajd.bridge.implementation.ResearchPaper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manuscript book = new Book(new StandardForammter(), "Brave New World",
                "If one's different, one's bound to be lonely");
        Manuscript paper = new ResearchPaper(new AcademicFormatter(), "Garbage", "Long formatted garbage");

        List<Manuscript> manuscripts = new ArrayList<>(Arrays.asList(new Manuscript[] { book, paper }));

        for (Manuscript s : manuscripts) {
            s.print();
        }
    }
}