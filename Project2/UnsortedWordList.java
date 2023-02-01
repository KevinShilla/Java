package Project.Project2;

import javax.swing.JTextArea;
import java.util.Random;
import java.util.LinkedList;

import javax.swing.JFrame;

public class UnsortedWordList extends WordList{
    // ORIGINAL TEXT
    public static void Original(JFrame frame, JTextArea text, LinkedList<String> txt) {
        text.setColumns(3);
        text.append("-----------------------\n");
        text.append("\n");
        LinkedList<String> line = new LinkedList<>(); // STORE THE TEXT FROM .TXT FILE
        WordList.word(line,txt);

        
        for(int i=0; i < txt.size(); i++) {
            text.append(txt.get(i) + "\n"); // PRINTING OUT THE LINKEDLIST
        }
        
    }
    // UNSORTED TEXT
    public static void unsorted(JFrame frame, JTextArea text2, LinkedList<String> txt) {
        text2.setColumns(3);
        text2.setText("Unsorted List! \n");
        text2.append("-----------------------\n");
        text2.append("\n");
        LinkedList<String> line = new LinkedList<>(); // STORE THE TEXT FROM .TXT FILE
        WordList.word(line,txt);

        
        Random random = new Random();
        for(int i=0; i < line.size(); i++) {
        int x = random.nextInt(line.size());
        text2.append(line.get(x) + "\n"); // PRINTING OUT THE LINKEDLIST IN RANDOM
        }
        
    }

    public static void sorted(JFrame frame, JTextArea text3, LinkedList<String> txt) {
        text3.setColumns(3);
        text3.setText("Sorted List! \n");
        text3.append("-----------------------\n");
        text3.append("\n");
        LinkedList<String> line = new LinkedList<>();
        LinkedList<String> f = new LinkedList<>();
        WordList.word(line,txt);

        // ARRANGE LINKEDLIST IN ALPHABETICAL ORDER
        String target;
        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0; i < Alphabet.length(); i++) {
            for(int j=0; j < line.size(); j++) {
                target = line.get(j);
            if(target.charAt(0) == Alphabet.charAt(i)) {
                f.add(target);
                line.remove(j);
                break;
            }

        }
        }
        // PRINT OUT THE ALPHABETICAL ORDER LINKED LIST
        for(int i=0; i < f.size(); i++) {
            text3.append(f.get(i) + "\n");
        }
        
    }


}
