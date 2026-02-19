package DSA1;

public class RotateArray {
    public static void main(String[] args) {

        // Array initialization
        int[] arr = {1, 2, 3, 4, 5};

        // Store last element
        int last = arr[arr.length - 1];

        // Shift elements to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Put last element at first position
        arr[0] = last;

        // Print rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
