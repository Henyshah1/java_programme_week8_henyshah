package javaprogramme;
/**
Read the numbers from the console entered by the user and
print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

 */
import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {
    //Main method
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        //Integer declared
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //While loop
        while (true){
            System.out.println("Enter number: ");
            //if function used
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                if (number < min){
                    min = number;
                }
                if (number > max){
                    max = number;
                }
            } else {
                // Exit the loop if an invalid number is entered
                break;
            }
            // Consume new line character left in the input buffer
            scanner.nextLine();
        }
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE){
            System.out.println("No valid numbers were entered.");
        }else {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        }
        scanner.close();
    }
}
