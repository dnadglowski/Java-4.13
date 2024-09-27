import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character");
        String letters = scanner.next();
        char letter = letters.charAt(0);
     
    boolean isletter = Character.isLetter(letter);
if (isletter == true){
    String result = (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
    letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
    ? letter + " is a vowel."
    : letter + " is a consonant.";
      System.out.println(result);
}else
System.out.println(letter+ " is not a character");


    }
}
