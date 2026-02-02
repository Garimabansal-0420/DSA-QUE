package DSA1;
import java.util.Scanner;

public class SetMatrixZeroes {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int [][] matrix=new int[n][m];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
                }
            }
        int a=0;
        int b=0;
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    a=i;
                    b=j;
                }
            }
        }
       for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==a || j==b)
                    matrix[i][j]=0;
            }
        }
        /*for (int i=0;i<matrix.length;i++){
            matrix[i][b]=0;

        }
        for (int j=0;j<matrix[0].length;j++){
            matrix[a][j]=0;

        }*/

        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] );
                }
            }

    }
}
