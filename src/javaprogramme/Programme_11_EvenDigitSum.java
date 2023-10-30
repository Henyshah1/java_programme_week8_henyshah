package javaprogramme;

import java.util.Scanner;

/**
Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.

 */
public class Programme_11_EvenDigitSum {
    //main method
    public static void main(String[] args) {
        //scanner used
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        //if-else function used
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int result = getEvenDigitSum(number);

            if (result == -1) {
                System.out.println("Invalid number.");
            } else {
                System.out.println("Sum of even digits: " + result);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        //scanner closed
        scanner.close();
    }
    //static method
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return  -1;
        }
        int sum = 0;
        //while loop
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0){
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
