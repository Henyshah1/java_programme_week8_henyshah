package javaprogramme;

import java.util.Scanner;

/**
Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.

 */
public class Programme_5_PalindromeNumber {
    //Main method
    public static void main(String[] args) {
        //scanner used
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            boolean result = isPalindrome(number);
            //if-else function used
            if (result) {
                System.out.println(number + " is true.");
            } else {
                System.out.println(number + " is false.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        //scanner closed
        scanner.close();
    }
    //Static method with boolean
    public static boolean isPalindrome(int number) {
        if (number < 0){
            //convert negative number to positive
            number = Math.abs(number);
        }
        //integers declared
        int originalNumber = number;
        int reverse = 0;
        //while loop used
        while (number > 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return originalNumber == reverse;
    }
}
