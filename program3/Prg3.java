//Write a program to demonstrate various arithmetic calculations using packages. 
import program3.arithmeticpack.Calculator;
public class Prg3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double num1 = 20.0;
        double num2 = 10.0;

        System.out.println("--- Arithmetic Calculations ---");
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
    }
}
    

