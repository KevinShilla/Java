
public class Lab3 {

    public static float converter(float fahrenheit) {
        float convert = 5f/9f * (fahrenheit - 32f);
        return convert;
    }
    public static void main(String[] args) {
        float fahrenheit;
        float centigrade;

        fahrenheit = 98.6f;
        centigrade = 5f/9f * (fahrenheit - 32f);
        System.out.println("The fahrenheit is: " + fahrenheit + " and the centigrade is: " + centigrade);

        System.out.println("FOR LOOP: ");
        

        for(fahrenheit=0f; fahrenheit <= 40f; fahrenheit+=5f) {
            centigrade = converter(fahrenheit);
            System.out.println("Fahrenheit: " + fahrenheit + " centigrade: " + centigrade);
        }

    }
}
