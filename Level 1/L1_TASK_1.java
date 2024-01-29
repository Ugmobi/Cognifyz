package Level_1;

import java.util.Scanner;
/*
 Cognifyz Level 1  Task 1 Temperature Converter.
 Designed And Developed by Utkarsh Gaikwad
 Skills: Basic input/output operations, arithmetic operations.
 */
public class L1_TASK_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================== Temperature Converter ===================");

        while (true) {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");

            System.out.println("Please Enter Your Choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(fahrenheit + " Fahrenheit.");
                System.out.println("Continue (y/n) : ");
                String contune = scanner.next();
                if (contune.equalsIgnoreCase("n")) {
                    break;
                }else{
                    continue;
                }

            } else if (choice == 2) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double far = scanner.nextDouble();
                double cel = fahrenheitToCelsius(far);
                System.out.println(cel + " Celsius.");
                System.out.println("Continue (y/n) : ");
                String contune = scanner.next();
                if (contune.equalsIgnoreCase("n")) {
                    break;
                }else{
                    continue;
                }

            } else {
                System.out.println("Invalid Choice !");
                break;
            }
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
