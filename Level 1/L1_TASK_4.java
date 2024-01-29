package Level_1;

import java.security.SecureRandom;
import java.util.Scanner;

/*
 Cognifyz Level 1  Task 4 Random Password Generator
 Designed And Developed by Utkarsh Gaikwad
 Skills: Random number generation, string manipulation, user input.
 */
public class L1_TASK_4 {
    public static void main(String[] args) {
        System.out.println("============== Random Password Generator =================");
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the desired length of the password: ");
            int passwordLength = scanner.nextInt();

            System.out.print("Include numbers? (y/n): ");
            boolean inc_numbers = scanner.next().equalsIgnoreCase("y");

            System.out.print("Include lowercase letters? (y/n): ");
            boolean inc_lowercase_let = scanner.next().equalsIgnoreCase("y");

            System.out.print("Include uppercase letters? (y/n): ");
            boolean inc_uppercase_let = scanner.next().equalsIgnoreCase("y");

            System.out.print("Include special characters? (y/n): ");
            boolean inc_special_char = scanner.next().equalsIgnoreCase("y");

            String password = Generate(passwordLength, inc_numbers, inc_lowercase_let, inc_uppercase_let, inc_special_char);

            // Display the generated password
            System.out.println("Generated Password: " + password);

            System.out.println("Continue(y/n): ");
            String oncemore = scanner.next();
            if (oncemore.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static String Generate(int length, boolean inc_numbers, boolean inc_lowercase_let, boolean inc_uppercase_let, boolean inc_special_char) {
        String lowercase_Letters = "abcdefghijklmnopqrstuvwxyz";
        String uppercase_Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special_Chars = "!@#$%^&*()-_+=<>?";
        StringBuilder builder = new StringBuilder();
        if (inc_lowercase_let) {
            builder.append(lowercase_Letters);
        }
        if (inc_uppercase_let) {
            builder.append(uppercase_Letters);
        }
        if (inc_numbers) {
            builder.append(numbers);
        }
        if (inc_special_char) {
            builder.append(special_Chars);
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(builder.length());
            password.append(builder.charAt(randomIndex));
        }

        return password.toString();
    }
}
