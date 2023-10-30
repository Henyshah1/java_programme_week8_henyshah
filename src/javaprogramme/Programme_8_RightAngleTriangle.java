package javaprogramme;

import java.util.Scanner;
/**
Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@

 */
public class Programme_8_RightAngleTriangle {
    //main method
    public static void main(String[] args) {
        //scanner used
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        //for loop
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        //scanner closed
        scanner.close();
    }
}
