package javaprogramme;

import java.util.Scanner;

/**
Digit Sum Challenge
Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them;
also we don't want to process negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine
that it is working correctly for valid and invalid values passed as arguments.

 */
public class Programme_4_DigitSumChallenge {
    //Main method
    public static void main(String[] args) {
        //scanner used
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //if-else function used
        if (scanner.hasNextInt()){
            int number = scanner.nextInt();
            int result = sumDigits(number);
            if (result == -1){
                System.out.println("Invalid number.");
            }else {
                System.out.println("The sum of the digits is: " + result);
            }
        }else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        //scanner closed
        scanner.close();
    }
    //Static method
    public static int sumDigits(int number) {
        if (number < 10 || number < 0){
            return -1;
        }
        int sum = 0;
        //while loop
        while (number > 0){
            //n % 10 is used to extract the least significant digit
            int digit = number % 10;
            sum += digit;
            //n = n /10 is used to discard the least significant digit
            number = number / 10;
        }
        return sum;
    }
}
