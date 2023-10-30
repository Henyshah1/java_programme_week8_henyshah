package javaprogramme;

import java.util.Scanner;
/**
Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153

 */
public class Programme_10_ArmstrongNumber {
    //main method
    public static void main(String[] args) {
        //scanner declared
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        //if function
        if (isArmstrongNumber(number)){
            System.out.println(number + " is an Armstrong number.");
        }else {
            System.out.println(number + " is not an Armstrong number.");
        }
        //scanner closed
        scanner.close();
    }
    //static method
    public static boolean isArmstrongNumber(int number){
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        //while loop
        while (number > 0){
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
