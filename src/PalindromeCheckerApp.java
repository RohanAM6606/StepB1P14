public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");

        System.out.println("==============================================");
        System.out.println("      USE CASE 2: Print a Hardcoded Palindrome Result");
        System.out.println("==============================================");
        String input = "MADAM";
        boolean isPalindrome = true;

        for (int j = 0; j < input.length() / 2; j++) {

            if (input.charAt(j) != input.charAt(input.length() - 1 - j)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("==============================================");
        System.out.println("      USE CASE 3: Reverse String Palindrome Check");
        System.out.println("==============================================");

        // Hardcoded input string
        input = "LEVEL";

        // Empty string to store reversed value
        String reversed = "";

        System.out.println("Original String: " + input);

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i); // string concatenation
        }

        System.out.println("Reversed String: " + reversed);

        // Compare strings using equals()
        if (input.equals(reversed)) {
            System.out.println("Result: \"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }
    }
}