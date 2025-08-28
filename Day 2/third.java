import java.util.*;

public class third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String originalStr1 = sc.nextLine().trim();
        String originalStr2 = sc.nextLine().trim();

      
        String str1 = originalStr1.toLowerCase().replaceAll("\\s", "");
        String str2 = originalStr2.toLowerCase().replaceAll("\\s", "");

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        if (Arrays.equals(str1Arr, str2Arr)) {
            System.out.println(originalStr1 + " and " + originalStr2 + " are Anagrams.");
        } else {
            System.out.println(originalStr1 + " and " + originalStr2 + " are Not Anagrams.");
        }

        sc.close();
    }
}
