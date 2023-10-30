package javaprogramme;

import java.util.Scanner;
/**
Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10

 */
public class Programme_6_NumberTrianglePattern {
    //Main Method
    public static void main(String[] args) {
        //Scanner declared
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int numRows = scanner.nextInt();
        //for loop is used
        for (int i = 1; i <= numRows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //scanner closed
        scanner.close();
    }
}
