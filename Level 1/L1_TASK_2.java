package Level_1;

import java.util.Scanner;
/*

 Cognifyz Level 1  Task 2 Palindrome Checker
 Designed And Developed by Utkarsh Gaikwad
 Skills: String manipulation, loops, conditional statements.

 */
public class L1_TASK_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();
            if (PalindromeCheck(input)) {
                System.out.println(input + " is a palindrome.");
                System.out.println("Continue: (y/n): ");
                String continues = scanner.next();
                if (continues.equalsIgnoreCase("n")){
                    break;
                }

            } else {
                System.out.println(input + " is not a palindrome.");
                System.out.println("Continue (y/n): ");
                String tocontinue = scanner.next();
                if (tocontinue.equalsIgnoreCase("n")){
                    break;
                }else{
                    continue;
                }
            }
        }
    }
    public static boolean PalindromeCheck(String str) {
        // Remove spaces and convert to lowercase for a case-insensitive check
        str = str.replaceAll("\\s", "").toLowerCase();

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // Characters don't match, not a palindrome
            }
        }
        return true; // All characters match, it's a palindrome
    }
}
