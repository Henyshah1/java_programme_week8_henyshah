package javaprogramme;
/**
Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.

 */
public class Programme_13_SharedDigit {
    //main method
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); //true
        System.out.println(hasSharedDigit(9, 99));//false
        System.out.println(hasSharedDigit(15, 55));//true
        System.out.println(hasSharedDigit(12, 34));//false
        System.out.println(hasSharedDigit(10, 99));//true
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        int num1FirstDigit = num1 / 10;
        int num2FirstDigit = num2 / 10;

        return (digit1 == digit2 || digit1 == num2FirstDigit || digit2 == num1FirstDigit || num1FirstDigit == num2FirstDigit);
    }
}
