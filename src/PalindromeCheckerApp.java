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

        input = "LEVEL";
        String reversed = "";

        System.out.println("Original String: " + input);

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: \"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("==============================================");
        System.out.println("      USE CASE 4: Character Array Based Palindrome Check");
        System.out.println("==============================================");

        input = "radar";
        System.out.println("Input String: " + input);

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome?: " + isPalindrome);

        System.out.println("==============================================");
        System.out.println("      USE CASE 5: Stack Based Palindrome Check");
        System.out.println("==============================================");

        input = "noon";
        System.out.println("Input String: " + input);

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome?: " + isPalindrome);

        System.out.println("==============================================");
        System.out.println("      USE CASE 6: Queue + Stack Based Palindrome Check");
        System.out.println("==============================================");

        input = "civic";
        System.out.println("Input String: " + input);

        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack2 = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack2.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome?: " + isPalindrome);

        System.out.println("==============================================");
        System.out.println("      USE CASE 7: Deque Based Optimized Palindrome Check");
        System.out.println("==============================================");

        input = "refer";
        System.out.println("Input String: " + input);

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        isPalindrome = true;

        while (deque.size() > 1) {
            char left = deque.removeFirst();
            char right = deque.removeLast();

            if (left != right) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome?: " + isPalindrome);

        System.out.println("==============================================");
        System.out.println("      USE CASE 8: Linked List Based Palindrome Check");
        System.out.println("==============================================");

        input = "level";
        System.out.println("Input String: " + input);

        java.util.LinkedList<Character> list = new java.util.LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        isPalindrome = true;

        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome?: " + isPalindrome);

        System.out.println("==============================================");
        System.out.println("      USE CASE 9: Recursive Palindrome Checker");
        System.out.println("==============================================");

        input = "madam";
        System.out.println("Input String: " + input);

        isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome?: " + isPalindrome);

        System.out.println("==============================================");
        System.out.println("      USE CASE 10: Case-Insensitive & Space-Ignored Palindrome");
        System.out.println("==============================================");

        input = "A man a plan a canal Panama";
        System.out.println("Input String: " + input);

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Normalized String: " + normalized);
        System.out.println("Is Palindrome?: " + isPalindrome);

        System.out.println("==============================================");
        System.out.println("      USE CASE 11: Object-Oriented Palindrome Service");
        System.out.println("==============================================");

        input = "racecar";
        System.out.println("Input String: " + input);

        PalindromeService service = new PalindromeService();
        isPalindrome = service.checkPalindrome(input);

        System.out.println("Is Palindrome?: " + isPalindrome);

        System.out.println("==============================================");
        System.out.println("      USE CASE 12: Strategy Pattern for Palindrome Algorithms");
        System.out.println("==============================================");

        input = "level";
        System.out.println("Input String: " + input);

        PalindromeStrategy strategy = new StackStrategy();
        isPalindrome = strategy.check(input);

        System.out.println("Is Palindrome?: " + isPalindrome);
    }

    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}

class PalindromeService {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}