package SchoolProjects.Project_1;

import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.awt.GridLayout;

public class Project1 {
    public static void main(String[] args) {
        int A = 0;
        int E = 0;
        int I = 0;
        int O = 0;
        int U = 0;

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,2));
try {
    BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
    String sentence;

    while((sentence = reader.readLine()) != null) {
        for(int j=0; j < sentence.length(); j++) {
         if((sentence.charAt(j) == 'a') || (sentence.charAt(j) == 'A')) {
             A++;
         }
         else if((sentence.charAt(j) == 'e') || (sentence.charAt(j) == 'E')) {
             E++;
         }
         else if((sentence.charAt(j) == 'i') || (sentence.charAt(j) == 'I')) {
             I++;
         }
         else if((sentence.charAt(j) == 'o') || (sentence.charAt(j) == 'O')) {
             O++;
         }
         else if((sentence.charAt(j) == 'u') || (sentence.charAt(j) == 'U')) {
             U++;
         }
     }
     
     frame.add(new JButton(sentence));
     frame.add(new JButton("A = " + A + "\n E = " + E + " \n I = " + I + "\n O = " + O + "\n U = " + U));

     frame.setVisible(true);

     A = 0;
     E = 0;
     I = 0;
     O = 0;
     U = 0;
 }
 reader.close();
} catch (IOException e) {
    e.printStackTrace();
}
    }
}
