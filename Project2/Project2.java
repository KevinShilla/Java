package Project.Project2;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.util.LinkedList;


public class Project2 extends UnsortedWordList{
    public static void main(String[] args) {
        JFrame frame  = new JFrame();
        frame.setTitle("Project2"); // title of jframe
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500); // sets the size of the JFrame
        frame.setLayout(new GridLayout(1,3));
        
        // ORIGINAL TEXT
        JTextArea text = new JTextArea(30,30);
        frame.add(text);
        text.setEditable(false);
        text.setText("Original Text\n");
        LinkedList<String> txt = new LinkedList();
        UnsortedWordList.Original(frame, text, txt); // method in the unsortedwordlist file
        
        // UNSORTED TEXT
        JTextArea text2 = new JTextArea(10,10);
        text2.setEditable(false);
        frame.add(text2);
        text.setEditable(false);
        UnsortedWordList.unsorted(frame, text2, txt); // method in another file

        //SORTED TEXT
        JTextArea text3 = new JTextArea(10,10);
        text3.setEditable(false);
        frame.add(text3);
        text.setEditable(false);
        UnsortedWordList.sorted(frame, text3, txt); // method in another file
        
        frame.setVisible(true); // make frame visible
    }


}
