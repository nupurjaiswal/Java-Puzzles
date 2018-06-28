package com.nupurjaiswal.problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("inputFile.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;

        while(scanner.hasNextLine()){

            String line = scanner.nextLine();

            words += line.split(" ").length;
        }
        System.out.println("There are " +words + " words in this book");
    }
}
