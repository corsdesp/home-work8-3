package com.epam.training.app;

import java.util.Map;

public class Print {
    public void printConsole(Map<String, Integer> dictionary){
        System.out.println(dictionary);
    }

    public void printConsoleError(){
        System.out.println("Неправильное имя файла");
    }
}
