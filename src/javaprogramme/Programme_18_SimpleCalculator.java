package javaprogramme;
/**
Write a class with the name SimpleCalculator.
The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
 */
public class Programme_18_SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    //Instance method used
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionalResult(){
        if (secondNumber == 0){
            return 0;
        }else {
            return firstNumber / secondNumber;
        }
    }
    //main method
    public static void main(String[] args) {
        Programme_18_SimpleCalculator calculator = new Programme_18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Add = " + calculator.getAdditionResult());
        System.out.println("Subtract = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply = " + calculator.getMultiplicationResult());
        System.out.println("Divide = " + calculator.getDivisionalResult());
    }
}
