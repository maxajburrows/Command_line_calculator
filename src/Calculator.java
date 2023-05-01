import java.util.Scanner;

public  class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        double number1 = scanner.nextDouble();
        System.out.println("Enter the second number");
        double number2 = scanner.nextDouble();
        scanner.close();
        double sum = addNumbers(number1,number2);
        printResult(number1, number2, sum);

    }
        // to get 2 numbers from user
     public static double addNumbers(double number1, double number2){



        return number1 + number2;


        // calculate the sum

        // Print the resulting string
    }

    public static void printResult(double number1, double number2, double sum){
        System.out.println("The sum of " + number1 + " + " + number2 + " is " + sum);
    }

}
