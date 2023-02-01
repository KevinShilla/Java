package Project.Project3;
//IMPORTS
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordGUI extends JFrame implements ActionListener{
    JFrame frame;
    JMenuBar bar;
    JMenu fileMenu,listMenu;
    JMenuItem Open,Exit,A,E,I,O,U;
    String filename,line,word;
    JTextArea printtext,Atext,Etext,Itext,Otext,Utext;
    JFileChooser fileChooser;
    int l = 1;
    BufferedReader reader;

    public void clear() {
        // CLEAR ANYTHING THAT IS IN COLUM 1 TO SHOW A NEW VOWEL
        if(Atext != null) {
        Atext.selectAll();
        Atext.replaceSelection("");
        }

        if(Etext != null) {
        Etext.selectAll();
        Etext.replaceSelection("");
        }

        if(Itext != null) {
        Itext.selectAll();
        Itext.replaceSelection("");
        }

        if(Otext != null) {
        Otext.selectAll();
        Otext.replaceSelection("");
        }

        if(Utext != null) {
        Utext.selectAll();
        Utext.replaceSelection("");
        }
    }

    WordGUI() {
        //MAKING A JFRAME
        frame = new JFrame();
        frame.setTitle("Project3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(1,2));

        //TEXTAREA TO PRINT THE TXT FILE
        printtext = new JTextArea(30,30);
        frame.add(printtext);
        printtext.setEditable(false);

        // TEXTAREA TO PRINT ALL THE WORDS THAT START WITH A OR a
        Atext = new JTextArea(30,30);
        frame.add(Atext);
        Atext.setEditable(false);
        
        //MENUBAR ON THE TOP LEFT
        bar = new JMenuBar();
        fileMenu = new JMenu("File");
        listMenu = new JMenu("List");

        //OPTIONS IN THE FILE BUTTON
        Open = new JMenuItem("Open");
        Exit = new JMenuItem("Exit");

        Open.addActionListener(this);
        Exit.addActionListener(this);

        fileMenu.add(Open);
        fileMenu.add(Exit);

        //OPTIONS IN THE LIST BUTTON
        A = new JMenuItem("A");
        E = new JMenuItem("E");
        I = new JMenuItem("I");
        O = new JMenuItem("O");
        U = new JMenuItem("U");

        A.addActionListener(this);
        E.addActionListener(this);
        I.addActionListener(this);
        O.addActionListener(this);
        U.addActionListener(this);

        listMenu.add(A);
        listMenu.add(E);
        listMenu.add(I);
        listMenu.add(O);
        listMenu.add(U);

        bar.add(fileMenu);
        bar.add(listMenu);

        // ADDING BAR AND SETTING FRAME TO BE VISIBLE
        frame.setJMenuBar(bar);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == Open) { // OPEN BUTTON
        fileChooser = new JFileChooser();
        int x = fileChooser.showOpenDialog(null);
        // IF USER CLICKED OPEN...
        if(x == JFileChooser.APPROVE_OPTION) {
            filename = fileChooser.getSelectedFile().getName();
            try {
                //THIS WILL READ THE LINE FROM THE TXT FILE AND APPEND IT TO JFRAME
                reader = new BufferedReader(new FileReader(filename));
                while((line = reader.readLine()) != null) {
                    printtext.append(l + ". " + line + "\n");
                    l++;
                }
                reader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        l = 1;
       }
       if(e.getSource() == Exit) { // EXIT BUTTON
        System.exit(0);
       }

       if(e.getSource() == A) { // A
        clear(); // CLEAR ANYTHING THAT IS IN THE SECOND COLUMN
            try {
                if(filename == null)
                throw new IllegalArgumentException("YOU MUST PICK A FILE");
                reader = new BufferedReader(new FileReader(filename));
                // THIS WILL SPLIT THE WORDS FROM A SENTENCE AND PLACE THEM IN AN ARRAY
                while((line = reader.readLine()) != null) {
                    String word[] = line.split(" ");
                    for(int i=0; i < word.length; i++) {
                        // IF A WORD STARTS WITH A OR a, THEN APPEND THE LINE NUMBER AND THE WORD
                        if(word[i].charAt(0) == 'A' || word[i].charAt(0) == 'a') {
                            Atext.append(l + ". " + word[i] + "\n");
                        }
                    }
                    l++;
                }
                reader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            l=1;
       }

       if(e.getSource() == E) {
        clear(); // CLEAR ANYTHING THAT IS IN THE SECOND COLUMN
        try {
            if(filename == null)
                throw new IllegalArgumentException("YOU MUST PICK A FILE");
            reader = new BufferedReader(new FileReader(filename));
            // THIS WILL SPLIT THE WORDS FROM A SENTENCE AND PLACE THEM IN AN ARRAY
            while((line = reader.readLine()) != null) {
                String word[] = line.split(" ");
                for(int i=0; i < word.length; i++) {
                    // IF A WORD STARTS WITH A OR a, THEN APPEND THE LINE NUMBER AND THE WORD
                    if(word[i].charAt(0) == 'E' || word[i].charAt(0) == 'e') {
                        Atext.append(l + ". " + word[i] + "\n");
                    }
                }
                l++;
            }
            reader.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        l=1;
        }

        if(e.getSource() == I) {
        clear(); // CLEAR ANYTHING THAT IS IN THE SECOND COLUMN
            try {
                if(filename == null)
                throw new IllegalArgumentException("YOU MUST PICK A FILE");
                reader = new BufferedReader(new FileReader(filename));
                // THIS WILL SPLIT THE WORDS FROM A SENTENCE AND PLACE THEM IN AN ARRAY
                while((line = reader.readLine()) != null) {
                    String word[] = line.split(" ");
                    for(int i=0; i < word.length; i++) {
                        // IF A WORD STARTS WITH A OR a, THEN APPEND THE LINE NUMBER AND THE WORD
                        if(word[i].charAt(0) == 'I' || word[i].charAt(0) == 'i') {
                            Atext.append(l + ". " + word[i] + "\n");
                        }
                    }
                    l++;
                }
                reader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            l=1;
        }

        if(e.getSource() == O) {
            clear(); // CLEAR ANYTHING THAT IS IN THE SECOND COLUMN
            try {
                if(filename == null) {
                throw new IllegalArgumentException("YOU MUST PICK A FILE");
                }
                reader = new BufferedReader(new FileReader(filename));
                // THIS WILL SPLIT THE WORDS FROM A SENTENCE AND PLACE THEM IN AN ARRAY
                while((line = reader.readLine()) != null) {
                    String word[] = line.split(" ");
                    for(int i=0; i < word.length; i++) {
                        // IF A WORD STARTS WITH A OR a, THEN APPEND THE LINE NUMBER AND THE WORD
                        if(word[i].charAt(0) == 'O' || word[i].charAt(0) == 'o') {
                            Atext.append(l + ". " + word[i] + "\n");
                        }
                    }
                    l++;
                }
                reader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            l=1;
        }

        if(e.getSource() == U) {
            clear(); // CLEAR ANYTHING THAT IS IN THE SECOND COLUMN
            try {
                if(filename == null)
                throw new IllegalArgumentException("YOU MUST PICK A FILE");
                reader = new BufferedReader(new FileReader(filename));
                // THIS WILL SPLIT THE WORDS FROM A SENTENCE AND PLACE THEM IN AN ARRAY
                while((line = reader.readLine()) != null) {
                    String word[] = line.split(" ");
                    for(int i=0; i < word.length; i++) {
                        // IF A WORD STARTS WITH A OR a, THEN APPEND THE LINE NUMBER AND THE WORD
                        if(word[i].charAt(0) == 'U' || word[i].charAt(0) == 'u') {
                            Atext.append(l + ". " + word[i] + "\n");
                        }
                    }
                    l++;
                }
                reader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            l=1;
        }
        
    }
}
