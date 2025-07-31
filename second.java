
public class second {
    public static void main(String args[]) {
        int arr[] = {1, 4, 3, 6, 7, 0};
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstmax) {
                secondmax = firstmax;
                firstmax = arr[i];
            } else if (arr[i] > secondmax && arr[i] != firstmax) {
                secondmax = arr[i];
            }
        }

        int product = firstmax * secondmax;
        System.out.println("Maximum Product: " + product);
    }
}
