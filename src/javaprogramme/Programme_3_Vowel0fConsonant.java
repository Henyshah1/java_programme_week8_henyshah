package javaprogramme;
/**
Write a Java program that takes the user to provide a single character from the alphabet.
Print Vowel of Consonant, depending on the user input.
If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1,
print an error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant

 */
import java.util.Scanner;

public class Programme_3_Vowel0fConsonant {
    //Main method
    public static void main(String[] args) {
        //scanner declared
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        //String declared
        String input = scanner.nextLine();
        //if function
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single alphabet character.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
            //Vowel declaration with if function
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Input letter is a Vowel");
            }else {
                System.out.println("Input letter is a consonant");
            }
        }
        //scanner closed
        scanner.close();
    }
}
