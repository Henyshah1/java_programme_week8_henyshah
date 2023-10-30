package javaprogramme;
/**
Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number.
Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number,
print the message Enter number #x: where x represents the count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number #2:, and so on.

 */
import java.util.Scanner;

public class Programme_1_ReadingUserInputChallenge {
    //Main method
    public static void main(String[] args) {
        //Scanner declaration for Input form console
       Scanner scanner = new Scanner(System.in);
       //integers declared
       int sum = 0;
       int count = 0;
       //While loop used
       while (count < 10){
           System.out.println("Enter number #" + (count + 1) + ": ");
           // If-else function used
           if (scanner.hasNextLine()){
               int number = scanner.nextInt();
               sum += number;
               count++;
           } else {
               System.out.println("Invalid Number");
           }
           //Consumes new line after entering a number
           scanner.nextLine();
       }
        System.out.println("Sum of the 10 number is: " + sum);
       //Scanner closed
       scanner.close();
    }
}
