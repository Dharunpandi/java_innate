import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        
        char[] arr = st.toCharArray();  // Convert to char array
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } 
            else if (!Character.isLetter(arr[right])) {
                right--;
            } 
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        System.out.println(new String(arr));
    }
}
