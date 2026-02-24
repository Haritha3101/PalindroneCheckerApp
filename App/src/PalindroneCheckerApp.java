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

            System.out.print("Enter string to check for palindrone: ");
            String input = sc.nextLine();

            if (input == null || input.isEmpty()) {
                System.out.println("Invalid input.");
            } else {
                String processed = input.toLowerCase();
                boolean isPalindrone = check(processed, 0, processed.length() - 1);

                if (isPalindrone) {
                    System.out.println("\"" + input + "\" is a palindrone.");
                } else {
                    System.out.println("\"" + input + "\" is NOT a palindrone.");
                }
            }
            sc.close();
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

