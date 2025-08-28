import java.util.*;

public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        // Check for spaces in password
        if (str.contains(" ")) {
            System.out.println("Weak password");
            return;
        }

        // Initialize flags for character types
        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
        int specialChar = 0;

        // Check password length
        if (str.length() >= 8) {
            // Loop through each character to check its type
            for (char ch : str.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    lowercase = 1;  // Found lowercase letter
                } else if (ch >= 'A' && ch <= 'Z') {
                    uppercase = 1;  // Found uppercase letter
                } else if (ch >= '0' && ch <= '9') {
                    digit = 1;      // Found digit
                } else {
                    specialChar = 1; // Found special character
                }
            }

            // Check if all conditions met
            if (uppercase + lowercase + digit + specialChar == 4) {
                System.out.println("Strong password");
            } else {
                System.out.println("Weak password");
            }
        } else {
            // Password length less than 8
            System.out.println("Weak password");
        }
    }
}
