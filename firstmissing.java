import java.util.*;

public class  firstmissing {
    public static void main(String[] args) {
        String str = "fffmsssing";
        System.out.println("First unique character by custom logic: " + findFirstAppearing(str));
    }

    public static char findFirstAppearing(String str) {
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen.contains(c)) {
                seen.add(c);
                return c;
            }
        }

        return '_'; // fallback if string is empty
    }
}
