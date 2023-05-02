import java.util.Scanner;

public  class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double number1 = getNumber();
        double number2 = getNumber();
        scanner.close();
        double sum = addNumbers(number1,number2);
        printResult(number1, number2, sum);

    }
        // to get 2 numbers from user

    public static double getNumber(){
        System.out.println("Enter a number");
        double num = scanner.nextDouble();
        return num;
    }
     public static double addNumbers(double number1, double number2){



        return number1 + number2;


        // calculate the sum

        // Print the resulting string
    }

    public static void printResult(double number1, double number2, double sum){
        System.out.println("The sum of " + number1 + " + " + number2 + " is " + sum);
    }

}
