import java.util.LinkedList;
import java.util.Scanner;
public class PalindroneCheckerApp {
    /**
     * ===========================================================================
     * MAIN CLASS - UseCase8PalindroneCheckerApp
     * ===========================================================================
     * * Use Case 8: Linked List Based Palindrone Checker
     * * Description:
     * This class checks whether a string is a palindrone
     * using a LinkedList.
     * * Characters are added to the list and then compared
     * by removing elements from both ends:
     * * - removeFirst()
     * - removeLast()
     * * This demonstrates how LinkedList supports
     * double-ended operations for symmetric validation.
     * * @author Developer
     * @version 8.0
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string to check: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toLowerCase().toCharArray()) {
            list.add(c);
        }

        boolean isPalindrone = true;

        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrone = false;
                break;
            }
        }

        if (isPalindrone) {
            System.out.println("\"" + input + "\" is a palindrone.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrone.");
        }

        sc.close();
        }
    }