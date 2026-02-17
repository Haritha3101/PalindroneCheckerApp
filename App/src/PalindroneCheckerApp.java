public class PalindroneCheckerApp {
    /**
     * ============================================================
     * MAIN CLASS - UseCase3PalindromeCheckerApp
     * ============================================================
     *
     * Use Case 3: Reverse String Based Palindrome Check
     *
     * Description:
     * This class checks whether a string is a palindrome
     * by reversing the string and comparing it with
     * the original value.
     *
     * At this stage, the application:
     * - Iterates the string in reverse order
     * - Builds a reversed version
     * - Compares original and reversed strings
     * - Displays the validation result
     *
     * This introduces transformation-based validation.
     *
     * @Author Developer
     * @Version 3.0
     */
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Author Haritha");
        System.out.println("Version 2.0");

        String original = "madam";

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

    }
}
