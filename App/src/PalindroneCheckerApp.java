import java.util.Scanner;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * The goal is to introduce benchmarking concepts.
 * * @author Developer
 * @version 13.0
 */
public class PalindroneCheckerApp {

    /**
     * Application entry point for UC13.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string for performance testing: ");
        String input = sc.nextLine();

        long startTime = System.nanoTime();

        boolean result = checkPalindrome(input);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("--- Benchmarking Results ---");
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + result);
        System.out.println("Execution Time: " + duration + " ns");

        sc.close();
    }

    /**
     * Standard palindrome check logic for benchmarking.
     */
    private static boolean checkPalindrome(String input) {
        String str = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
