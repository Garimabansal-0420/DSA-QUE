package DSA1;

public class Rotate_Matrix_90 {
    public static void main() {
        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr2=new int [arr.length][arr[0].length];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr2[i][j]=arr[j][i];
            }
        }
    }
}
