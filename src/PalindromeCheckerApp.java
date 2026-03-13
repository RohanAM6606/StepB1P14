public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");

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
    }
}