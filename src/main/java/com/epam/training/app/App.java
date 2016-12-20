package com.epam.training.app;

import java.io.File;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Print print = new Print();
        String textInFile = new ReadFile().read(new File(args[0]));

        Map<String, Integer> dictionary = new TextDictionary().dictionary(textInFile);

        print.printConsole(dictionary);
    }
}
