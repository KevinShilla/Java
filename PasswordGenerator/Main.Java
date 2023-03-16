import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Please enter the length of your desired password (Minimum 5)"); 
        int length = Integer.parseInt(s);
        while(length <= 4) {
        s = JOptionPane.showInputDialog(null, "enter length greater than 4");
        length = Integer.parseInt(s);
        }
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int letters = 0;
        int numbers = 0;
        int p = 1;
        String generatedPassword = String.valueOf(upperCase.charAt(random.nextInt(27)));
        p++;

        for(int i=0; i < length; i++) {
            letters = random.nextInt(27);
            numbers = random.nextInt(10);
            if(p <= length) {
            generatedPassword = generatedPassword + Integer.toString(numbers);
            p++;
            }
            if(p <= length) {
            generatedPassword = generatedPassword + String.valueOf(lowerCase.charAt(letters));
            p++;
            }
            if(p <= length) {
            generatedPassword = generatedPassword + String.valueOf(upperCase.charAt(letters));
            p++;
            }
        }

        JOptionPane.showMessageDialog(null, "Your Generated Password is: " + generatedPassword, "Password Generator", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
