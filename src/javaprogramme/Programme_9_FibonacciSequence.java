package javaprogramme;

import java.util.Scanner;

/**
Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciSequence {
    //main method
    public static void main(String[] args) {
        //scanner used
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int numTerms = scanner.nextInt();

        int firstTerm = 1;
        int secondTerm = 1;

        if (numTerms >= 1) {
            System.out.print(firstTerm + " ");
        }
        if (numTerms >= 2) {
            System.out.print(secondTerm + " ");
        }
        //for loop
        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}
