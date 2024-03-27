import javax.swing.JOptionPane;

public class Project0{
    public static void main(String[] args) {
     int upperCase = 0; // checks the E upper case
     int lowerCase = 0; // checks the e lower case
     String sentence; // where the user will store his/her sentence
     boolean loop = true; // this boolean will help the program to continue asking the user to enter a sentence until the word "STOP"

    while(loop) {
     sentence = JOptionPane.showInputDialog(null, "Please enter a sentence");

    if(sentence.equalsIgnoreCase("STOP")) {
     loop = false; // to stop the while loop
     continue; // skip everything after this line and go straight back to the while condition
    }

    for(int i=0; i < sentence.length(); i++) {
     if(sentence.charAt(i) == 'E') {
        upperCase++;
     } // if statement checks if user input has upper case e
     else if(sentence.charAt(i) == 'e') {
        lowerCase++;
     } // else if statement checks if user input has lower case e
    } // for loop checks all the characters in the sentence the user inputs

    JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lowerCase + "\n" + "Number of upper case e's: " + upperCase, "Message" , JOptionPane.INFORMATION_MESSAGE);
    // This JOPtionPane prints out an information message dialog on the screen to inform the user how many lower and upper cases are in his/her sentence
    upperCase = 0;
    lowerCase = 0;
    }
    }
}
