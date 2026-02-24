import java.util.Scanner;
public class PalindroneCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of the service class
        PalindromeService service = new PalindromeService();

        System.out.print("Enter string to check: ");
        String input = sc.nextLine();

        if (service.checkPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}


class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        String str = input.toLowerCase();

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


