package Project.Project2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class WordList {
    public static void word(LinkedList<String> line, LinkedList<String> txt) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("input.txt")); // bufferedreader to read the .txt file
                String linetxt;
                while((linetxt = reader.readLine()) != null) {
                    line.add(linetxt); // adding the words from the file to the linkedlist
                    txt.add(linetxt); // same thing ^^^
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}