package javaprogramme;

import java.util.Scanner;

/**
First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.

 */
public class Programme_7_FirstAndLastDigitSum {
    //Main method
    public static void main(String[] args) {
        //scanner used
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int result = sumFirstAndLastDigit(number);
            //if-else function used
            if (result == -1) {
                System.out.println("Invalid number.");
            } else {
                System.out.println("Sum of first and last digits: " + result);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        //scanner closed
        scanner.close();
    }
    //static method
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        //Integer declared
        int lastDigit = number % 10;
        int firstDigit = 0;
        //while loop
        while (number > 0){
            firstDigit = number;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }
}
