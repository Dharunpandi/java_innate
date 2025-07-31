public class reverse {
    public static void main(String args[]) {
        String str = "dharun";
        char[] arr = str.toCharArray(); // convert to mutable char array
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            // swap using a temp variable
            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // convert back to String and print
        System.out.println(new String(arr));
    }
}
