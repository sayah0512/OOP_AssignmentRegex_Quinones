// Josiah B. Quiñones
// BSIT-2B
// November 10, 2026

import java.util.*;
import java.util.regex.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== REGEX VALIDATION =====");

        System.out.print("\nEnter a string: ");
        String input = sc.nextLine();

        System.out.println("\n===== VALIDATION RESULTS =====");

        // 1. Check if the string contains only digits.
        Pattern pattern = Pattern.compile("^[0-9]+$");
        Matcher matcher = pattern.matcher(input);

        System.out.println("\nOnly digits: " + matcher.matches());

        // 2. Check if the string contains only letters.
        System.out.println("Only letters: " + Pattern.matches("^[a-zA-Z]+$", input));

        // 3. Check if the string contains letters and numbers.
        boolean hasLetter = input.matches(".*[a-zA-Z].*");
        boolean hasDigit = input.matches(".*[0-9].*");

        System.out.println("Letters and numbers: " + (hasLetter && hasDigit));

        // 4. Check if the string starts with Java.
        System.out.println("Starts with Java: " + input.matches("^Java.*"));

        // 5. Check if the string ends with .com.
        System.out.println("Ends with .com: " + input.matches(".*\\.com$"));

        // 6. Check if the string contains exactly 5 digits.
        System.out.println("Exactly 5 digits: " + input.matches("[0-9]{5}"));

        // 7. Check if the string contains at least 8 characters.
        System.out.println("At least 8 characters: " + input.matches(".{8,}"));

        // 8. Check if the string contains whitespace.
        System.out.println("Contains whitespace: " + input.matches(".*\\s.*"));

    }
}
