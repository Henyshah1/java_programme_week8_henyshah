package javaprogramme;

import java.util.Scanner;
/**4
Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *

 */
public class Programme_15_leftAngleTriangle {
    public static void main(String[] args) {
        //Scanner used
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        //for loop
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
