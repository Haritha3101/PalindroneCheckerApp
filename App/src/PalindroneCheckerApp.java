import java.util.Scanner;
public class PalindroneCheckerApp {
    /**
     * ===========================================================================
     * MAIN CLASS - UseCase9RecursivePalindrone
     * ===========================================================================
     * * Use Case 9: Recursive Palindrone Checker
     * * Description:
     * This class validates a palindrone using recursion.
     * * Characters are compared from the outer positions
     * moving inward using recursive calls.
     * * The recursion stops when:
     * - All characters are matched, or
     * - A mismatch is found.
     * * This use case demonstrates divide-and-conquer
     * logic using method recursion.
     * * @author Developer
     * @version 9.0
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Palindrone Checker (Normalized) ---");
        System.out.print("Enter a string or phrase: ");
        String input = sc.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("Invalid input.");
        } else {
            String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            boolean isPalindrone = checkPalindrone(normalized);

            if (isPalindrone) {
                System.out.println("Result: \"" + input + "\" is a palindrone.");
            } else {
                System.out.println("Result: \"" + input + "\" is NOT a palindrone.");
            }
        }

        sc.close();
    }

    private static boolean checkPalindrone(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


