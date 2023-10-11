//Create the subtract method for the subtraction of two numbers inside the Calculator.java class.
public class Calculator {

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 10;
        int num2 = 5;

        int result = calculator.subtract(num1, num2);
        System.out.println("Result of subtraction: " + result);
    }
}
