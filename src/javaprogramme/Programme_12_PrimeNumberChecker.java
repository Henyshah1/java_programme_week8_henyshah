package javaprogramme;

import java.util.Scanner;
/**
Write a programme to input any number and check if it is prime or not.
 */
public class Programme_12_PrimeNumberChecker {
    //main method
    public static void main(String[] args) {
        //scanner declared
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        //if function
        if (isPrime(number)){
            System.out.println(number + " is a prime number.");
        }else {
            System.out.println(number + " is not a prime number.");
        }
        //scanner closed
        scanner.close();
    }
    //static method
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        if (number <= 3){
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0){
            return false;
        }
        //for loop
        for (int i = 5; i * i <= number; i += 6){
            if (number % i == 0 || number % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
