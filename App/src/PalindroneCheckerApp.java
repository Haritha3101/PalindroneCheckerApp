public class PalindroneCheckerApp {
    /**
     * ============================================================
     * MAIN CLASS - UseCase2PalindromeCheckerApp
     * ============================================================
     *
     * Use Case 2: Hardcoded Palindrome Validation
     *
     * Description:
     * This class demonstrates basic palindrome validation
     * using a hardcoded string value.
     *
     * At this stage, the application:
     * - Stores a predefined string
     * - Compares characters from both ends
     * - Determines whether the string is a palindrome
     * - Displays the result on the console
     *
     * This use case introduces fundamental comparison logic
     * before using advanced data structures.
     *
     * @Author Haritha
     * @Version 2.0
     */
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Author Haritha");
        System.out.println("Version 2.0");

        String word = "madam";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}