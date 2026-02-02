package DSA1;

public class spiral_matrix {
    public static void main() {
        int[][] arr = {
                {1, 2, 3, 4, 5, 6},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };
        int top = 0, left = 0, right = arr[0].length - 1, bottom = arr.length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for(int i=top ; i<=bottom;i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;
            for(int i=right;i>=left;i--){
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }

    }
}