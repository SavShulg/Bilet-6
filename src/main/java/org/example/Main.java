package org.example;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C://Users//Desktop//text"));

            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл не найден!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}