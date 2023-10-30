package javaprogramme;

import java.util.Scanner;
/**
Write a program in Java to display the pattern like a diamond.
While loop

 */
public class Programme_14_Diamond {
    //Main method
    public static void main(String[] args) {
        //scanner used
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd number): ");
        int numRows = scanner.nextInt();

        if (numRows % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
        } else {
            int spaces = numRows / 2;
            int stars = 1;

            int row = 1;
            //While loop used
            while (row <= numRows) {
                //for loop
                for (int space = 0; space < spaces; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < stars; star++) {
                    System.out.print("*");
                }
                System.out.println();

                if (row <= numRows / 2) {
                    spaces--;
                    stars += 2;
                } else {
                    spaces++;
                    stars -= 2;
                }

                row++;
            }
        }
        //scanner closed
        scanner.close();
    }
}
