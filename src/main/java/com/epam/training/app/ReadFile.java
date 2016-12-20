package com.epam.training.app;

import java.io.*;

public class ReadFile {
    public String read(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                stringBuilder.append(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            new Print().printConsoleError();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
