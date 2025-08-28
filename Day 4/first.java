import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Character c = sc.next().charAt(0); // read single char
        sc.nextLine(); // consume newline
        String str = sc.nextLine(); // read full string

        for (char ch : str.toCharArray()) {
            if (ch == c) {
                System.out.println("Present");
                return;
            }
        }
        System.out.println("Not Present");
    }
}
