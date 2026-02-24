import java.util.Scanner;
import java.util.Stack;

/**
 * ===========================================================================
 * INTERFACE - PalindromeStrategy
 * ===========================================================================
 * This interface defines a contract for all
 * palindrome checking algorithms.
 * * Any new algorithm must implement this interface
 * and provide its own validation logic.
 */
interface PalindromeStrategy {
    boolean isValid(String input);
}

/**
 * ===========================================================================
 * CLASS - StackStrategy
 * ===========================================================================
 * Implements a concrete Stack-based strategy.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        if (input == null || input.isEmpty()) return false;

        String str = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * ===========================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 * * * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 * * * No performance comparison is done in this use case.
 * * The focus is purely on algorithm interchangeability.
 * * The goal is to teach extensible algorithm design.
 * * * @author Developer
 * @version 12.0
 */
public class PalindroneCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string to check: ");
        String text = sc.nextLine();

        // Dynamically select the strategy
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the selected algorithm through the interface
        if (strategy.isValid(text)) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}

