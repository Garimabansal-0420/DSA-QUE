package Recursion;

public class Quick_Sort {

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};

        quick(arr, 0, arr.length - 1);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = solve(arr, low, high);
            quick(arr, low, pivotIndex - 1);
            quick(arr, pivotIndex + 1, high);
        }
    }

    public static int solve(int[] arr, int low, int high) {
        int pivotElement = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {

            while (i <= high && arr[i] <= pivotElement) {
                i++;
            }

            while (arr[j] > pivotElement) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}